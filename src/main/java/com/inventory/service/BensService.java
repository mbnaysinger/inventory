/*package com.inventory.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.entity.Bens;
import com.inventory.repository.BensRepository;

@Service
public class BensService extends AbstractService implements Serializable{

	private static final long serialVersionUID = -8849809744683913207L;
	
	@Autowired
	private transient BensRepository brep;	
    
	public List<Bens> todosBens() {
		return brep.findAll();
		
	}
	
}*/