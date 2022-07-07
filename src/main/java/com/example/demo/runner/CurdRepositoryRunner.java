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
		System.out.println(service.countOfVaccines());
		
		Object result[] =(Object[]) service.getVaccineDataByPriceRange(400.0,500.0);
		System.out.println("Vaccine Count: " + result[0]);
		System.out.println("Max Price: " + result[1]);
		System.out.println("Min Price: " + result[2]);
		System.out.println("Avg Price: " + result[3]);
		System.out.println("Sum Price: " + result[4]);
	}

}