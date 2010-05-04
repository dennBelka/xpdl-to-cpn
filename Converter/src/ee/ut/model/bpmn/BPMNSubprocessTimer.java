package ee.ut.model.bpmn;

import ee.ut.converter.CPNProcess;
import ee.ut.converter.parser.ElementParser;
import ee.ut.converter.parser.SimDataParser;

public class BPMNSubprocessTimer extends BPMNElement {

	String outputPlaceId;
	String okPlaceId;
	String nokPlaceId;
	String timerTokenPlaceId;
	String completeTransId;
	
	public BPMNSubprocessTimer(CPNProcess cPNProcess, Object obj, ElementParser elementParser) {
		super(cPNProcess);
		elementId = elementParser.getId(obj);
		elementName = elementParser.getName(obj);
		
		okPlaceId = cPNProcess.getCpnet().addPlace(elementName + "OK").getId();
		nokPlaceId = cPNProcess.getCpnet().addPlace(elementName + "NOK").getId();
		completeTransId = cPNProcess.getCpnet().addTrans(elementName + "COMPLETE").getId();
		timerTokenPlaceId = cPNProcess.getCpnet().addTrans(elementName + "TIMER").getId();
		String exeptionTransId = cPNProcess.getCpnet().addTrans(elementName + "EXCEPTION").getId();
		
	}

	@Override
	public void addSimulationData(SimDataParser simDataParser) {
		// TODO Auto-generated method stub

	}



}