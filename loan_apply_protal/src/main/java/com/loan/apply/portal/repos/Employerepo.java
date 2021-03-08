package com.loan.apply.portal.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.loan.apply.portal.details.Employement;
@Repository
public  interface Employerepo extends MongoRepository<Employement,String> {
	

}
