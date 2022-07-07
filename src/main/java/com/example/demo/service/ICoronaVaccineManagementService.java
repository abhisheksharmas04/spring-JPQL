package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.CoronaVaccine;

public interface ICoronaVaccineManagementService {
	public Optional<CoronaVaccine> fetchVaccineByName(String name);
	public Object fetchVaccineDataByName(String name);
}
