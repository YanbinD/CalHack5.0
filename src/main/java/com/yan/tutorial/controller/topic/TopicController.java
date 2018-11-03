package com.yan.tutorial.controller.topic;

import java.util.List;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics") //default for GET request 
	public List<Topic> getAllTopics () {
		return topicService.getAllTopics();
	}
	
	// {id} will allow /topic/xxxx to match 
	// @PathVariable will inject xxxx to id in the parameter 
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	// === POST request ===
	@RequestMapping(method=RequestMethod.POST, value="/topics") //Map this method to requests that is a POST and uri = /topics 
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	// === PUT request ===
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}") //Map this method to requests that is a POST and uri = /topics 
	public void updatTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(topic, id);
	}
}
