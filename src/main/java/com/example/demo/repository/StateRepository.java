package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Country;
import com.example.demo.entity.States;

public interface StateRepository extends JpaRepository<States, Integer> {

	 
    @Query("SELECT s FROM States s WHERE s.country = :country")
    List<States> findByCountry(@Param("country") Country country);

	List<States> findByCountryId(Integer countryId);
	

}
