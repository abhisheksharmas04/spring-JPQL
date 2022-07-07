package com.example.demo.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.CoronaVaccine;
import com.example.demo.service.ICoronaVaccineManagementService;



@Component
public class CurdRepositoryRunner implements CommandLineRunner {

	@Autowired
	private ICoronaVaccineManagementService service;

	@Override
	public void run(String... args) throws Exception {
		Optional<CoronaVaccine>opt = service.fetchVaccineByName("physer");
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}else {
			System.out.println("Record Not Found");
		}
		
		Object obj = service.fetchVaccineDataByName("sputnik");
		Object details[] = (Object[])obj;
		for(Object val: details) {
			System.out.println(val + " ");
		}
	}

}