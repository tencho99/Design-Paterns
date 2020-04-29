package observer;

public class ObserverMain {

	public static void main(String[] args) {
		Topic topic = new Topic();
		Observer obs1 = new TopicBuyer("Buyer 1");
		Observer obs2 = new TopicBuyer("Buyer 2");
		Observer obs3 = new TopicBuyer("Buyer 3");
		
		topic.Buy(obs1);
		topic.Buy(obs2);
		topic.Buy(obs3);
		
		topic.setName("New topic");
		topic.setName("Another topic");
	}

}
