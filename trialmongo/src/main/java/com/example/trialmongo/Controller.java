package com.example.trialmongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	StudentRepo repo;

	@GetMapping("/FindData")
	public List<Student> FindData() {
		return repo.findAll();
	}
	
	@PutMapping("/PutData")
	public String PutData(@RequestBody Student obj) {
		repo.save(obj);
		return "saved";
	}
	
	@PostMapping("/UpdateData")
	public String UpdateData(@RequestBody Student obj) {
		repo.save(obj);
		return "Updated";
	}
	
	@DeleteMapping("/Delete/{_id}")
	public String Delete(@PathVariable int _id) {
		repo.deleteById(_id);
		return "deleted";
	}
	
}
