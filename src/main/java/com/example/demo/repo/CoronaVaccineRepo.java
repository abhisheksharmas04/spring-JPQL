package com.example.demo.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.CoronaVaccine;

public interface CoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {
	
	@Modifying
	@Query("UPDATE CoronaVaccine SET price=:newPrice where country=:vCountry")
	@Transactional
	public int updatePriceByCompany(Double newPrice, String vCountry);
}