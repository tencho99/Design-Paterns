package observer;

public interface Observable {
	public void Buy(Observer observer);
	public void Sell(Observer observer);
	public void notifyObservers();
	public String getUpdate();
}
