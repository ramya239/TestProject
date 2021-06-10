package com.gradstad.gradstad.entities;

public class Names {
	
	private long id;
	private String Name;
	public Names(long id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	public Names() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Names [id=" + id + ", Name=" + Name + "]";
	}
	
	
	

}
