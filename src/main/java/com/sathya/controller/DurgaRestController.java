package com.sathya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.iservice.IDurgaService;
import com.sathya.model.Durga;

@RestController
public class DurgaRestController {
	
	
	@Autowired
	private IDurgaService service;
	
@PostMapping("/save")
	public String save(@RequestBody Durga d)
	
	{
		service.save(d);
		
		return"sucessfully registerd record";
	}
@GetMapping("/get")
public Durga  getByid(@RequestParam Integer id)
{
	Durga jk=service.getByid(id);
	
	return jk;
}

@GetMapping("/getAll")
public List<Durga>  getAll(){
	List<Durga> hg=service.getAll();
	
	return hg;
}
}
