package com.gradstad.gradstad.service;

import java.util.List;

import com.gradstad.gradstad.entities.Names;

public interface NameService {

	
	public List<Names> getNames();
	
	public Names getName(long nameID);
	
	public Names addNames(Names names);
	
	public Names upNames(Names names);
	
	public String delNames(long namesID);

	Names getNames(long nameID);
}

