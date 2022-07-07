package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.CoronaVaccine;

public interface CoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {
	
//	@Query(value = " FROM com.example.demo.entity.CoronaVaccine where company=?1")
//	@Query(value = "SELECT cv FROM CoronaVaccine as cv where cv.company=?1")
	//@Query(value = "SELECT cv FROM CoronaVaccine as cv where cv.company=:company")
//	List<CoronaVaccine> searchVaccinesByCompany(String company);
	@Query(value = "SELECT cv FROM CoronaVaccine as cv where cv.company=:comp")
	List<CoronaVaccine> searchVaccinesByCompany(@Param("comp") String company);
	
//	@Query(value = "SELECT cv FROM CoronaVaccine as cv where cv.price >=?1 AND cv.price <=?2")
	@Query(value = "SELECT cv FROM CoronaVaccine as cv where cv.price >=:min AND cv.price <=:max")
	public List<CoronaVaccine> searchVaccinesByPriceRange(double min, double max);
	
	// Entity Query selecting all colom values
	@Query("FROM CoronaVaccine WHERE company IN(:company1,:company2,:company3) ORDER BY company")
	public List<CoronaVaccine>searchVaccinesByCompanes(String company1, String company2, String company3);
	
	//Scalar Query selecting multiple col values
	@Query("SELECT name, company, price FROM CoronaVaccine WHERE name IN(:name1, :name2)")
	public List<Object[]>searchVanniceDetailsByNames(String name1, String name2);
	

}