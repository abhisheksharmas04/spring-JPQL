package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CoronaVaccine;
import com.example.demo.repo.CoronaVaccineRepo;



@Service("vaccineManagementService")
public class CoronaVaccineManagementServiceImpl implements ICoronaVaccineManagementService {
	
	@Autowired
	private CoronaVaccineRepo coronaRepo;

	@Override
	public Optional<CoronaVaccine> fetchVaccineByName(String name) {
		return coronaRepo.searchVaccineByName(name);
	}

	@Override
	public Object fetchVaccineDataByName(String name) {
		return coronaRepo.searchVaccineDataByName(name);
	}
}
