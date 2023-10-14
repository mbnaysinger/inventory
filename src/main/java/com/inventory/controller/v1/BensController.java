package com.inventory.controller.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.entity.Bens;
import com.inventory.repository.BensRepository;

@RestController
@RequestMapping("/")

public class BensController {

	@Autowired
	private BensRepository service;

	@GetMapping(value = "consultaBens/")
	public List<Bens> consultarBens() {
		return service.findAll();
	}
	
}
