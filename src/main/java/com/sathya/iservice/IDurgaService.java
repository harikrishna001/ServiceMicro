package com.sathya.iservice;

import java.util.List;

import com.sathya.model.Durga;

public interface IDurgaService {
	
	
	public void save(Durga d);
	
	public Durga getByid(Integer id);
	
	public List<Durga> getAll();
}
