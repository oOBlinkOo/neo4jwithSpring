package com.example.demo;

import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.annotation.Id;

@NodeEntity
public class Person {

	
   public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
private String name;
   private String from;

   @Id
   
   private Long id;
   
   
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
@Override
public String toString() {
	return "Person [name=" + name + ", from=" + from + ", id=" + id + "]";
}



  
}