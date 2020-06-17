package state;

public class StateMain {

	public static void main(String[] args) {

		Context worker = new Context("Worker1");
		Context worker2 = new Context("Worker2");
		Context worker3 = new Context("Worker3");
		
		StartS startState = new StartS();
		StateM MidState = new StateM();
		StopS stopState = new StopS();
		
		startState.applyState(worker);
		MidState.applyState(worker2);
		stopState.applyState(worker3);
		
		State workerState = worker.getState();
		String currentState = workerState.getStateName();
		System.out.println("currentState: " + currentState);
		
		State worker2State = worker2.getState();
		String currentState2 = worker2State.getStateName();
		System.out.println("currentState: " + currentState2);
		
		State worker3State = worker3.getState();
		String currentState3 = worker3State.getStateName();
		System.out.println("currentState: " + currentState3);
			
	}

}
