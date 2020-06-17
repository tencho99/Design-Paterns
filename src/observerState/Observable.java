package observerState;


public interface Observable {
	public void Order(Observer observer);
	public void Send(Observer observer);
	public void Receive(Observer observer);
	public void notifyObservers();
	public String getUpdate();
}
