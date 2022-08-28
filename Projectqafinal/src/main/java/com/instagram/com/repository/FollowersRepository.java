package com.instagram.com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.instagram.com.model.Followers;

@Repository
public interface FollowersRepository extends JpaRepository<Followers, Integer>{

	Optional<Followers> findAllById(Followers followers1);


}

	
