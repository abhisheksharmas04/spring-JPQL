package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.CoronaVaccine;

public interface CoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {
	// Select Query Performing Single Row Operation
	//Entity Query giving single row
	@Query("FROM CoronaVaccine WHERE name=:vname")
	public Optional<CoronaVaccine> searchVaccineByName(String vname);
	
	//Scalar query giving specific multiple col values of single row
	@Query("SELECT name, company, country FROM CoronaVaccine WHERE name=:vname")
	public Object searchVaccineDataByName(String vname);

}