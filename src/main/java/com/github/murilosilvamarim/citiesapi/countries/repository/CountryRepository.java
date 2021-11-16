package com.github.murilosilvamarim.citiesapi.countries.repository;

import com.github.murilosilvamarim.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<Country, Long> {

}
