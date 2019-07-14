package com.vikram.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicservice;
	
	
	@RequestMapping("/topics")
	public List<Topic> getalltopics() {
		return topicservice.getalltopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic gettopic(@PathVariable String id)
	{
		return topicservice.gettopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public Topic addtopic(@RequestBody Topic topic)
	{
		return topicservice.addtopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public Topic updatetopic(@RequestBody Topic topic,@PathVariable String id )
	{
		return topicservice.updatetopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deletetopic(@PathVariable String id)
	{
		 topicservice.deletetopic(id);
	}
	
}
