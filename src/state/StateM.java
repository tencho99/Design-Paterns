package state;

public class StateM implements State {

	private String stateName = "Pacage on the move";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);

	}

	@Override
	public String getStateName() {
		return this.stateName;
	}


}
