package com.gss.egp.cptu.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics=new ArrayList<>(Arrays.asList(
			new Topic("Java","Core java","Core Java Description"),
			new Topic("Python","Python Basics","Python Basics Description"),
			new Topic("Spring","Spring Name","Spring Core Java Description"),
			new Topic("Struts","Struts Name","Struts Java Description"),
			new Topic("Hibernate","Hibernate Name","Hibernate Java Description"),
			new Topic("JSP","JSP Name","JSP Java Description"),
			new Topic("Servlets","Servlets Name","Servlets Java Description")
	));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id){
		return topics.stream().filter(to -> to.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
		for(int i=0;i<topics.size();i++){
			Topic top=topics.get(i);
			if(top.getId().equals(id)){
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topics.removeIf(topic -> topic.getId().equals(id));
		
	}

	
 }
