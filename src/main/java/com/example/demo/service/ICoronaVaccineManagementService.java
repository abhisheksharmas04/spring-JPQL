package com.example.demo.service;

public interface ICoronaVaccineManagementService {
	public long countOfVaccines();
	public Object getVaccineDataByPriceRange(double min, double max);
}
