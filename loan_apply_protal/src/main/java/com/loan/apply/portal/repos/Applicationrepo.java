package com.loan.apply.portal.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.loan.apply.portal.details.ApplicationForm;

@Repository
public interface Applicationrepo extends MongoRepository<ApplicationForm , String>{
 ApplicationForm findUserByuserid(String id); 
}
