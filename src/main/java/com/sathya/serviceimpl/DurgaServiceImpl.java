package com.sathya.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.iservice.IDurgaService;
import com.sathya.model.Durga;
import com.sathya.repo.DurgaRepo;
@Service
public class DurgaServiceImpl  implements  IDurgaService  {

	@Autowired
private 	DurgaRepo  repo;
	
	
	@Override
	public List<Durga> getAll() {


		List<Durga> kj=	repo.findAll();
		return kj;
	}

	@Override
	@Transactional
	public void save(Durga d) {

repo.save(d);
		
	}

	@Override
	public Durga getByid(Integer id) {


		Optional<Durga> h=	repo.findById(id);
		
		if(h.isPresent())
		{
			return h.get();
		}else
		{
			return null;
		}
	}
}
