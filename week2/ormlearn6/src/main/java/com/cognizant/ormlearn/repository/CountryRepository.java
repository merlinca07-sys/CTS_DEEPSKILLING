package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // Search countries containing the given text
    List<Country> findByNameContainingIgnoreCase(String text);

    // Search countries containing the given text and sort ascending
    List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(String text);

    // Find countries starting with the given letter
    List<Country> findByNameStartingWithIgnoreCase(String alphabet);

}