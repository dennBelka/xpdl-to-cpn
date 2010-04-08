package ee.ut.model.cpn2;

import java.util.List;

import ee.ut.model.xpdl2.Activity;

import noNamespace.Place;

public final class BPMNActivity extends BPMNElement {

	private List<String> inputPlaceIds;
	private List<String> outputPlaceIds;
	private String transitionId;

	public BPMNActivity(CPNet cpnet, Object o) {
		super(cpnet);

		Activity xpdlActivity = ((Activity) o);
		setId(xpdlActivity.getId());

		// We assume that we only need a transition, because all the inputs and
		// outputs can be generated dynamically.
		transitionId = cpnet.addTrans().getId();

	}

	/**
	 * We generate inputs dynamically. Every time we want to make a connection
	 * between the gateway input and activity, we make a new input Place to both
	 * ends. It generates kind of AND Joins.
	 * 
	 * @return
	 */
	public String makeInput() {
		Place p = cpnet.addPlace();
		inputPlaceIds.add(p.getId());
		cpnet.addArc(p.getId(), transitionId);
		return p.getId();
	}

	public String makeOutput() {
		Place p = cpnet.addPlace();
		outputPlaceIds.add(p.getId());
		cpnet.addArc(transitionId, p.getId());
		return p.getId();
	}

}
