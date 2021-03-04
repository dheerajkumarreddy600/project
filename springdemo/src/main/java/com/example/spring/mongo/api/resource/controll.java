package com.example.spring.mongo.api.resource;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.mongo.api.model.book;
import com.example.spring.mongo.api.repo.Bookrepo;

@RestController
public class controll {
	@Autowired
    private Bookrepo repo;
	@PostMapping("/Addbook")
	public String saveBook(@RequestBody book bok) {
		repo.save(bok);
		return "Added book id"+bok.getId();
	}
	@GetMapping("/findAll")
	public List<book> getBooks(){
		return repo.findAll();
	}
	@GetMapping("/findAll/{id}")
	public Optional<book> getBook(@PathVariable int id){
		return repo.findById(id);
	}
	@DeleteMapping("/delete/{id}")
	public String deleBooks(@PathVariable int id) {
		repo.deleteById(id);
		return "book deleted with id:"+id;
	}
}	
