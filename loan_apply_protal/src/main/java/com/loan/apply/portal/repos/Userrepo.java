package com.loan.apply.portal.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository;

import com.loan.apply.portal.details.User;
@Repository
public interface Userrepo extends MongoRepository<User,String>{
    
User findByphonenumber(String phonenumber);


}
