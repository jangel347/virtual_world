package co.edu.poli.states.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.poli.states.model.Country;

public interface CountryRepository  extends JpaRepository<Country, String>{

}
