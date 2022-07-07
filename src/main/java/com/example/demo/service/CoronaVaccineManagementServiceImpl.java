package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.CoronaVaccineRepo;



@Service("vaccineManagementService")
public class CoronaVaccineManagementServiceImpl implements ICoronaVaccineManagementService {
	
	@Autowired
	private CoronaVaccineRepo coronaRepo;

	@Override
	public long countOfVaccines() {
		return coronaRepo.getVacciesCount();
	}

	@Override
	public Object getVaccineDataByPriceRange(double min, double max) {
		return coronaRepo.getVaccineAggrigateDataByPriceRange(min, max);
	}
}
