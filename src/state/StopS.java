package state;

public class StopS implements State {

	private String stateName = "Pacage delivered";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);

	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

}
