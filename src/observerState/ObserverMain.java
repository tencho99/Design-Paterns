package observerState;

import observerState.Observer;
import observerState.Topic;
import observerState.TopicOrder;

public class ObserverMain {

	public static void main(String[] args) {
		Topic topic = new Topic();
		Observer obs1 = new TopicOrder("Worker 1");
		Observer obs2 = new TopicOrder("Worker 2");
		Observer obs3 = new TopicOrder("Worker 3");
		
		topic.Order(obs1);
		topic.Send(obs2);
		topic.Receive(obs3);
		
		topic.setName("New topic");
		topic.setName("Another topic");
	}
				
}
