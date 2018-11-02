package com.yan.tutorial.controller.topic;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopics () {
		return Arrays.asList(
					new Topic ("Spring", "Spring Framework", "Spring Framework Description"), 
					new Topic ("Java", " Core Java", "Core Java Descption"),
					new Topic ("javascript", "JavaScript", "JavaScript Description")
				);
	}
}
