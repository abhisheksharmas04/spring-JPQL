package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.CoronaVaccine;

public interface CoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {
	
	@Query("SELECT COUNT(*) FROM CoronaVaccine")
	public long getVacciesCount();
	
	@Query("SELECT COUNT(*),MAX(price), MIN(price), SUM(price), AVG(price) FROM CoronaVaccine WHERE price>=:min AND price <=:max")
	public Object getVaccineAggrigateDataByPriceRange(double min, double max);

}