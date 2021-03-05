package com.loan.apply.portal.repos;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.loan.apply.portal.details.User;

public interface Userrepo extends MongoRepository<User,String>{
      @Query("{ph:?0}") 
	Optional<User> findByPhonenumber(int  ph);
        	
        }
	


