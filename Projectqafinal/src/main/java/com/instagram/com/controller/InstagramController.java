package com.instagram.com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instagram.com.model.Followers;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController 
@RequestMapping
public class InstagramController {
	
	//auto-wire the followersService class  
	@Autowired  
	com.instagram.com.service.FollowersService service;  
	
	@ApiResponses(value = {
	    @ApiResponse(code = 200, message = "Return help message")
	})
	@GetMapping("/")
	public String greeting() {return "Welcome . Please go to \"/allfollowers\" for all available followers";
		}
	
	@ApiResponses(value = {
		    @ApiResponse(code = 200, message = "All Followers received successfuly")
		})
	//creating a get mapping that retrieves all the followers detail from the database   
	@GetMapping("/allfollowers")  
	private List<Followers> getAllfollowers()   
	{  
	return service.getAllfollowers(); 
	}  
	
	//creating a get mapping that retrieves the detail of a specific followers 
	@GetMapping("/followers/{followersid}")  
	private Optional<Followers> getfollowersById(@PathVariable("followersid") int followersid)   
	{  
	Object followersId = null;
	return service.getfollowersById(followersId);  
	}  
	
	//creating a delete mapping that deletes a specified followers
	@DeleteMapping("/deletefollowers/{followersid}")  
	private void deletefollowers(@PathVariable("followersid") int followersid) {  
	
	service.delete(followersid);  
	} 
	

    //creating put mapping that updates the followers detail   
	@PutMapping("/savefollowers")  
	private Followers update(@RequestBody Followers followers1)   
	{  
	service.getFollowersServiceById(followers1);  
	return followers1;  
	}  
	
}
