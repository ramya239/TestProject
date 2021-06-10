package com.gradstad.gradstad.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gradstad.gradstad.entities.Names;

@Service
public class NameServiceimpl implements NameService {

	List<Names> list;
	
	public NameServiceimpl() {
		
		list=new ArrayList<>();
		list.add(new Names(1,"RamyaG"));
		list.add(new Names(2,"RitiG"));
		list.add(new Names(3,"SundarG"));
	}
	
	@Override
	public List<Names> getNames() {
		// TODO Auto-generated method stub
		return list;
	}
	
	

	
	
	@Override
	public Names getNames(long nameID) {
		
		Names c=null;
		for(Names name:list)
		{
			if(name.getId()==nameID) {
				c=name;
				break;
			}
		}
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	public Names getName(long nameID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Names addNames(Names names) {
		
		list.add(names);
		// TODO Auto-generated method stub
		return names;
	}

	@Override
	public Names upNames(Names names) {
		
		list.forEach(e ->{
			if(e.getId()==names.getId()) {
				e.setName(names.getName());
				
			}
		});
		// TODO Auto-generated method stub
		return names;
	}

	@Override
	public String delNames(long nameID) {
		// TODO Auto-generated method stub
		return "deleted" ;
	}


}

