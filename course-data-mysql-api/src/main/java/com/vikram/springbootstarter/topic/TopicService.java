package com.vikram.springbootstarter.topic;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//this marks as the business service. Its a single ton.
@Service
public class TopicService {

	@Autowired
	private TopicRepository topicrepository;
	/*List<Topic> topics=	new ArrayList<>(  Arrays.asList(
			new Topic("spring", "Spring frame work", "Spring basic course"),
			new Topic("java", "Core java", "Java basic course"),
			new Topic("mysql", "database course", "DB course")));*/
	
	public List<Topic> getalltopics()
	{
		List<Topic> topics=new ArrayList<>();
		topicrepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic gettopic(String id)
	{
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicrepository.findById(id).get();
	}

	public Topic addtopic(Topic topic) {
		//topics.add(topic);
		topicrepository.save(topic);
		return null;
	}

	public Topic updatetopic(String id, Topic topic) {
		topicrepository.save(topic);
		return null;
	}

	public Topic deletetopic(String id) {
		//topics.removeIf(t ->t.getId().equals(id));
		topicrepository.deleteById(id);
		return null;
	}

	
}
