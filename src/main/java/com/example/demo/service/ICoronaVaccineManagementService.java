package com.example.demo.service;

public interface ICoronaVaccineManagementService {
	public int updateVaccinePriceByCountry(Double newPrice, String country);
	public int removeVaccinesByPriceRange(Double startPrice, Double endPrice);
}
