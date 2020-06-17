package state;

public class StartS implements State {
	
	private String stateName = "Pacage ordored";
	
	@Override
	public void applyState(Context context) {
		context.setState(this);

	}

	@Override
	public String getStateName() {
		return this.stateName;
	}

}
