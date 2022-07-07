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
//		service.fetchVaccinesByCompany("pyzer").forEach(System.out::println);
		service.fetchVaccinesByPriceRange(600.0,700.0).forEach(System.out::println);
//		service.fetchVaccineDataByNames("pyzer","sputnik").forEach(vaccine -> System.out.println(vaccine[0] + "" + vaccine[1]));
		service.fetchVaccineDataByNames("pyzer","sputnik").forEach(vaccine -> {
			for(Object val : vaccine) {
				System.out.println(val);
			}
		});
	}

}