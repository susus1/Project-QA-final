package com.instagram.com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instagram.com.model.Followers;
import com.instagram.com.repository.FollowersRepository;


@Service  
public class FollowersService   
	{  
	@Autowired  
	FollowersRepository repository;  
	
	
	public List<Followers> getAllfollowers()   
	{
	List<Followers> followers1 = new ArrayList<Followers>();  
	repository.findAll().forEach(followers2 -> followers1.add((Followers) followers2));  
	return followers1;   
	}   
	
	//saving a specific record by using the method save() 
	//of CrudRepository;  

	
	//getting a specific record by using the method findById() 
	//of CrudRepository; 
	public Optional<Followers> getFollowersServiceById(Followers followers1)   
	{  

		return repository.findAllById(followers1);
	} 
	//deleting a specific record by using the method deleteById() 
	//of CrudRepository; 
	public void delete(int id)   
	{  
		repository.deleteById(id);  
	}  
	//updating a record  
	public void update(Followers followers1, int followersid)   
	{  
		repository.save(followers1);  
	}

	public void update(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public Optional<Followers> getfollowersById(Object followersId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}  

