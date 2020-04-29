package observer;

public class TopicBuyer implements Observer {
	private String name;
	private Observable topic;
	
	public TopicBuyer(String name) {
		this.setName(name);
	}
	@Override
	public void update() {
		if(topic==null) {
		System.out.println("No Topic");
		return;
	}
		String topicName = topic.getUpdate();
		System.out.println(this.getName() + " updated with: " + "Topic is: " + topicName);

	}

	@Override
	public void setTopic(Observable topic) {
		this.topic = topic;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
