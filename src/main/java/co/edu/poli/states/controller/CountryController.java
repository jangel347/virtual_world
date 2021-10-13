package co.edu.poli.states.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.states.model.Country;
import co.edu.poli.states.repository.CountryRepository;

@RestController
@RequestMapping("api/country/")
public class CountryController {

	@Autowired
	CountryRepository country_repository;
	
	public CountryController() {

	}
	
	@PostMapping("/insert")
	public Country insertCountry(@RequestBody Country country) {
		country_repository.save(country);
		return country;
	}

	@PostMapping("/insert_list")
	public List<Country> insertCountryList(@RequestBody List<Country> country_list) {
		country_repository.saveAll(country_list);
		return country_list;
	}

	@GetMapping("/select_all")
	public List<Country> selectCountrys() {
		return country_repository.findAll();
	}

	@GetMapping("/select_one")
	public Object selectCountry(@RequestParam("id") String id) {
		return country_repository.findById(id);
	}

	@PutMapping("/update/{id}")
	public Object updateCountry(@PathVariable String id, @RequestBody Country country) {
		Country c_update = country_repository.getById(id);

		c_update.setCode(country.getCode());
		c_update.setName(country.getName());
		c_update.setAlternative_names(country.getAlternative_names());
		c_update.setCoordinates(country.getCoordinates());
		c_update.setStates(country.getStates());


		country_repository.save(c_update);

		return country;
	}

	@DeleteMapping("/delete")
	public Object deleteCountry(@RequestParam("id") String id) {
		country_repository.deleteById(id);
		return "The country was deleted successfully";
	}
}
