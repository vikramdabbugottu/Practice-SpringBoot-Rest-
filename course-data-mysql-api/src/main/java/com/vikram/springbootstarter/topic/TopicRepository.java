package com.vikram.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>
{
	//get all the data from the topis table
	//get a topic from the table
	//update a topic
	//create a new topic
	//delete a topic
	//*******//
	//** The spring Data Jpa have already created a CRUD frame work. The spring data JPA has a 
	//class. so we need an interface which extends an CRUDreposatory

}
