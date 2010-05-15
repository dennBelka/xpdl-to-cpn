package ee.ut.model.bpmn;

import ee.ut.converter.BProcess;
import ee.ut.converter.parser.Parser;
import ee.ut.converter.parser.SimDataParser;

public class BPMNIntermediateTimerEvent extends BPMNElement {

	String inputPlaceId;
	String outputPlaceId;
	int timerDelay;

	public BPMNIntermediateTimerEvent(BProcess pr, Parser p, Object o) {
		super(p, pr);

		elementId = parser.getElementParser().getId(o);
		elementName = parser.getElementParser().getName(o);

		inputPlaceId = process.getCpnet().addPlace(elementName + "IN").getId();
		String transitionId = process.getCpnet().addTrans(elementName).getId();

		process.getCpnet().addArc(inputPlaceId, transitionId);
		outputPlaceId = process.getCpnet().addPlace(elementName + "OUT")
				.getId();

		String delayArc = process.getCpnet()
				.addArc(transitionId, outputPlaceId).getId();
		timerDelay = parser.getElementParser().getEventTimer(o);
		process.getCpnet().setArcAnnot(delayArc, "c@+" + timerDelay);
	}

	@Override
	public void addSimulationData(SimDataParser simDataParser) {
		// TODO Auto-generated method stub

	}

	public int getTimerDelay() {
		return timerDelay;
	}

	@Override
	public String getInputPlaceId() {
		return inputPlaceId;
	}

	@Override
	public String getOutputPlaceId(String ref) {
		return outputPlaceId;
	}

}
