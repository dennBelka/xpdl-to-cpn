package ee.ut.bpmnsim;

import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlString;

import noNamespace.Annot;
import noNamespace.Arc;
import noNamespace.Id;
import noNamespace.Page;
import noNamespace.Place;
import noNamespace.Port;
import noNamespace.Trans;

public class Task {
	private Page page;
	private XmlObject color;
	private XmlObject variable;

	private Place entryPlace;
	private Place exitPlace;
	private Trans transition;
	
	private String name;
	
	public Task(Page page, String name, XmlObject color, XmlString variable) {
		this.page = page;
		this.color = color;
		this.variable = variable;
		this.name = name.replaceAll("\\b\\s{1,}\\b", "_");
		// --- INPUT Place
		entryPlace = Util.createPlace(page, name + "_entry");
		entryPlace.getTypeArray()[0].getText().set(color.copy());
		//entryPlace.addNewType().addNewText().set(color.copy());		
		Port inPort = entryPlace.addNewPort();
		inPort.setType("In");
		
		// --- EXIT Place
		exitPlace = Util.createPlace(page, name + "_exit");
		exitPlace.getTypeArray()[0].getText().set(color.copy());
		Port outPort = exitPlace.addNewPort();
		outPort.setType("Out");
		
		transition = Util.createTrans(page, name);

		Util.createArc(page, entryPlace, transition, (XmlString) variable.copy());
		
		Util.createArc(page, transition, exitPlace, (XmlString) variable.copy());
	}

	public void setTimeExpresion(XmlString expr) {
		transition.getTimeArray(0).getText().set(expr);
	}
		
	public Place getEntryPlace() {
		return entryPlace;
	}

	public Place getExitPlace() {
		return exitPlace;
	}
	
	public String getName() {
		return name;
	}
}
