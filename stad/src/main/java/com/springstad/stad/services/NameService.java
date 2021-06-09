package com.springstad.stad.services;

import java.util.List;

import com.springstad.stad.entitites.Names;

public interface NameService {

	
	public List<Names> getNames();
	
	public Names getName(long nameID);
	
	public Names addNames(Names names);
	
	public Names upNames(Names names);
	
	public String delNames(long namesID);

	Names getNames(long nameID);
}
