package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CoronaVaccine;

public interface ICoronaVaccineManagementService {
	public List<CoronaVaccine> fetchVaccinesByCompany(String companyName);
	public List<CoronaVaccine> fetchVaccinesByPriceRange(double min, double max);
	public List<Object[]> fetchVaccineDataByNames(String name1, String name2);
}
