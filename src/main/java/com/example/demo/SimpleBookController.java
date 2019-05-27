package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("books-rest")
public class SimpleBookController {
 
	
	@Autowired
	PersonRepository repo;
	
	   @RequestMapping("/person")
    public void getBook() {
    	findBookById(0);
    }
 
    private Person findBookById(int id) {
    	System.out.println("test ");
    	List <Person> x= new ArrayList();
    	for (Person person : x) {
			
		}
//    	Optional<Person> respose = repo.findById(0L);
//    	System.out.println("test 2" +respose);
//    	System.out.println("test 2.1" +respose.get());
    	return null;
    }
}