package com.springstad.stad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springstad.stad.entitites.Names;
import com.springstad.stad.services.NameService;

@RestController

public class MyController {
	
	@Autowired
	
	private NameService nameservice;
	// get employee names
	@RequestMapping(path="/Names",method = RequestMethod.GET)
	public List<Names> getNames(){
		
		return this.nameservice.getNames();
		
	}
	
	@RequestMapping(path="/names/{nameID}",method = RequestMethod.GET)
	
	public Names getNames(@PathVariable String nameID) {
		return this.nameservice.getNames(Long.parseLong(nameID));
	}
}
