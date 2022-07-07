package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CoronaVaccine;
import com.example.demo.repo.CoronaVaccineRepo;



@Service("vaccineManagementService")
public class CoronaVaccineManagementServiceImpl implements ICoronaVaccineManagementService {
	
	@Autowired
	private CoronaVaccineRepo coronaRepo;

	@Override
	public List<CoronaVaccine> fetchVaccinesByCompany(String companyName) {
		return coronaRepo.searchVaccinesByCompany(companyName);
	}

	@Override
	public List<CoronaVaccine> fetchVaccinesByPriceRange(double min, double max) {
		return coronaRepo.searchVaccinesByPriceRange(min, max);
	}

	@Override
	public List<Object[]> fetchVaccineDataByNames(String name1, String name2) {
		return coronaRepo.searchVanniceDetailsByNames(name1, name2);
	}
}
