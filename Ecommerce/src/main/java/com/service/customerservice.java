package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.customerimp;
import com.model.User;

@Service
@Transactional
public class customerservice {
	
	private customerimp c;
	
	@Autowired
	public customerservice(customerimp c) 
	{
     this.c=c;

	}




	
	 public User getUserById(int id)
	 {
		 return c.getUserById(id);
	 }

	 
 
	public void adduser(User user) {  
		System.out.println("service");
		  c.adduser(user); 
		 } 
}
