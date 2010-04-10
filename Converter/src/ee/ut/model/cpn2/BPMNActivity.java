package ee.ut.model.cpn2;

import java.util.List;

import ee.ut.model.xpdl2.Activity;

import noNamespace.Place;

public final class BPMNActivity extends BPMNElement {

	private List<String> inputPlaceIds;
	private List<String> outputPlaceIds;
	private String transitionId;

	public BPMNActivity(Process process, Object o) {
		super(process);

		Activity xpdlActivity = ((Activity) o);
		setId(xpdlActivity.getId());

		// We assume that we only need a transition, because all the inputs and
		// outputs can be generated dynamically.
		transitionId = process.getCpnet().addTrans().getId();

	}

	/**
	 * We generate inputs dynamically. Every time we want to make a connection
	 * between the gateway input and activity, we make a new input Place to both
	 * ends. It generates kind of AND Joins.
	 * 
	 * @return
	 */
	public String makeInput() {
		Place p = process.getCpnet().addPlace();
		inputPlaceIds.add(p.getId());
		process.getCpnet().addArc(p.getId(), transitionId);
		return p.getId();
	}

	public String makeOutput() {
		Place p = process.getCpnet().addPlace();
		outputPlaceIds.add(p.getId());
		process.getCpnet().addArc(transitionId, p.getId());
		return p.getId();
	}

}
