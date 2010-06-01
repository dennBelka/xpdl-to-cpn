package ee.ut.converter.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import ee.ut.converter.BProcess;
import ee.ut.converter.Element;
import ee.ut.converter.factory.RelayFactory;
import ee.ut.model.xpdl2.Activity;

public class Parser {

	// Process model file parser 
	private ElementParser elementParser;
	
	// Simulation data file parser
	private SimDataParser simDataParser;
	
	// RelayFactory for handling the element mappings
	private RelayFactory relayFactory;
	
	// Root process instance with id=0
	private BProcess rootProcess = new BProcess(null, "0");

	
	public void setElementParser(ElementParser p) {
		elementParser = p;
	}

	public void setSimDataParser(SimDataParser p) {
		simDataParser = p;
	}

	public void setElementFactory(RelayFactory f) {
		relayFactory = f;
	}

	/**
	 * Method starts parsing from the root process.
	 * @return Root process.
	 */
	public BProcess parse() {
		return parse(rootProcess);
	}

	
	/**
	 * Method converts a given process instance.
	 * @param p In-memory empty process instance.
	 * @return Created process.
	 */
	public BProcess parse(BProcess p) {
		System.out.println("\n\n===== STARTING TO CONVERT PROCESS: "
				+ p.getId() + " =====");

		Object startElement = elementParser.getSource(p.getId());
		Stack<Object> elementsToParse = new Stack<Object>();
		elementsToParse.push(startElement);

		HashMap<Object, Element> parsedElements = new HashMap<Object, Element>();
		Stack<String> prevElems = new Stack<String>();

		while (!elementsToParse.empty()) {
			Element convertedElement = null;
			String prevElem = null;

			Object element = elementsToParse.pop();
			if (!prevElems.empty())
				prevElem = prevElems.pop();

			ArrayList<Object> nextElements = elementParser
					.getNextElements(element);

			if (!parsedElements.containsKey(element)) {
				try {
					convertedElement = relayFactory.create(p, element);
				} catch (Exception e) {
					e.printStackTrace();
				}
				p.addElement(convertedElement.getId(), convertedElement);
				parsedElements.put(element, convertedElement);
			}

			if (convertedElement != null) {
				System.out.println("Converted elem:"
						+ ((Activity) element).getId() + " to: "
						+ convertedElement);

				for (Object e : nextElements) {
					elementsToParse.push(e);
					prevElems.push(convertedElement.getId());
				}
			}

			// Here we connect the two object
			if (prevElem != null) {
				relayFactory.connectElements(p, parsedElements.get(element), p
						.getElement(prevElem));
				System.out.println("Transition: "
						+ p.getElement(prevElem).getId() + " -> "
						+ parsedElements.get(element).getId());

			}
		}

		p.printAdjList();
		p.findSinks();
		p.findSource();

		if (simDataParser.hasData()) {
			for (Element e : p.getElements().values()) {
				try {
					e.addSimulationData(simDataParser);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		return p;
	}

	public void save(String s, Boolean layouting) {
		rootProcess.saveToCPN(s, layouting);
	}

	public ElementParser getElementParser() {
		return elementParser;
	}

	public SimDataParser getSimDataParser() {
		return simDataParser;
	}

	public RelayFactory getRelayFactory() {
		return relayFactory;
	}

	public BProcess getRootProcess() {
		return rootProcess;
	}

}