package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.CoronaVaccineRepo;



@Service("vaccineManagementService")
public class CoronaVaccineManagementServiceImpl implements ICoronaVaccineManagementService {
	
	@Autowired
	private CoronaVaccineRepo coronaRepo;

	@Override
	public int updateVaccinePriceByCountry(Double newPrice, String country) {
		return coronaRepo.updatePriceByCompany(newPrice, country);
	}

	@Override
	public int removeVaccinesByPriceRange(Double startPrice, Double endPrice) {
		return coronaRepo.deleteVaccinesByPriceRange(startPrice, endPrice);
	}
}
