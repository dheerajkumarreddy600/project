package com.loan.apply.portal.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.loan.apply.portal.details.Loandetails;

@Repository
public interface Loanrepo extends MongoRepository<Loandetails,String> {
	Loandetails findUserByuserid(String id);

}
