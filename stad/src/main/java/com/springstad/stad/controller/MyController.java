package com.springstad.stad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springstad.stad.entitites.Names;
import com.springstad.stad.services.NameService;
@RestController
@RequestMapping(path="api/names")

public class MyController {
	
	@Autowired
	
	private NameService nameservice;
	// get employee names
	@GetMapping
	public List<Names> getNames(){
		
		return this.nameservice.getNames();
		
	}
	
	@GetMapping("/{nameID}")
	
	public Names getNames(@PathVariable("nameID") String nameID) {
		return this.nameservice.getNames(Long.parseLong(nameID));
	}
	
	@PostMapping("/addname")
	 
	public Names addNames(@RequestBody Names names) {
		return this.nameservice.addNames(names);
	}
	
	
	@PutMapping("/updatename")
	
	public Names upNames(@RequestBody Names names) {
		return this.nameservice.upNames(names);
	}
	
	@DeleteMapping("/deletename/{nameID}")
	
	public String delNames(@PathVariable String nameID) {
		return this.nameservice.delNames(Long.parseLong(nameID));
	}
}
	
	
