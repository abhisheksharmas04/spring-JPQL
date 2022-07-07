package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.ICoronaVaccineManagementService;



@Component
public class CurdRepositoryRunner implements CommandLineRunner {

	@Autowired
	private ICoronaVaccineManagementService service;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(service.updateVaccinePriceByCountry(700.0, "Russian"));
	}

}