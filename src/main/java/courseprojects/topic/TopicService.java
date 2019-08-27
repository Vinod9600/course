package courseprojects.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
		new Topic("spring","Spring Framwork", "Spring framework Description"),
		new Topic("Java","core java", "Core java Description"),
		new Topic("Spring AOP","Spring AOP Framework", "Spring AOP Description")
		));

	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String id) {
		Topic topic = topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		if(topic == null) {
			topic = topics.get(0);
		}
		return topic;
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}
}
