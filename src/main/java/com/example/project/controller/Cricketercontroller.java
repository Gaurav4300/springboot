package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Cricketer;
import com.example.project.service.Cricketerservice;

@RestController
public class Cricketercontroller {
	
	@Autowired
	private Cricketerservice cricketerservice;
	
	@GetMapping("/get/all")
	public List<Cricketer> getallcricketer()
	{
		return cricketerservice.getcricketer();
	}
	
	@PostMapping("/get")
	public Cricketer createcricketer(@RequestBody Cricketer c)
	{
		return cricketerservice.createcricketer(c);
	}
	
	@GetMapping("/get/{id}")
	public Cricketer getbyid(@PathVariable int id)
	{
		return cricketerservice.getbyid(id);
	}
	
	@PutMapping("/update/{id}")
	public Cricketer updatecricketer(@RequestBody Cricketer c,@PathVariable int id)
	{
		return cricketerservice.updatecricketer(c,id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deletebyid(@PathVariable int id)
	{
		cricketerservice.deletebyid(id);
		return "deleted successfully";
	}

}
