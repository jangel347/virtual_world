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

import co.edu.poli.states.model.State;
import co.edu.poli.states.repository.StateRepository;

@RestController
@RequestMapping("api/state/")
public class StateController {

	@Autowired
	StateRepository state_repository;

	public StateController() {

	}

	@PostMapping("/insert")
	public State insertState(@RequestBody State state) {
		state_repository.save(state);
		return state;
	}

	@PostMapping("/insert_list")
	public List<State> insertStateList(@RequestBody List<State> state_list) {
		state_repository.saveAll(state_list);
		return state_list;
	}

	@GetMapping("/select_all")
	public List<State> selectStates() {
		return state_repository.findAll();
	}

	@GetMapping("/select_one")
	public Object selectState(@RequestParam("id") Integer id) {
		return state_repository.findById(id);
	}

	@PutMapping("/update/{id}")
	public Object updateState(@PathVariable Integer id, @RequestBody State state) {
		State d_update = state_repository.getById(id);

		d_update.setState(state.getState());
		d_update.setSlug(state.getSlug());
		d_update.setCode(state.getCode());
		d_update.setNickname(state.getNickname());
		d_update.setWebsite(state.getWebsite());
		d_update.setAdmission_date(state.getAdmission_date());
		d_update.setAdmission_number(state.getAdmission_number());
		d_update.setCapital_city(state.getCapital_city());
		d_update.setCapital_url(state.getCapital_url());
		d_update.setPopulation(state.getPopulation());
		d_update.setPopulation_rank(state.getPopulation_rank());
		d_update.setConstitution_url(state.getConstitution_url());
		d_update.setState_flag_url(state.getState_flag_url());
		d_update.setState_seal_url(state.getState_seal_url());
		d_update.setMap_image_url(state.getMap_image_url());
		d_update.setLandscape_background_url(state.getLandscape_background_url());
		d_update.setSkyline_background_url(state.getSkyline_background_url());
		d_update.setTwitter_url(state.getTwitter_url());
		d_update.setFacebook_url(state.getFacebook_url());
		d_update.setGovernor(state.getGovernor());
		d_update.setCountry(state.getCountry());

		state_repository.save(d_update);

		return state;
	}

	@DeleteMapping("/delete")
	public Object deleteState(@RequestParam("id") Integer id) {
		state_repository.deleteById(id);
		return "The state was deleted successfully";
	}
	
	// get the state where the capital_city start with the letter or phrase specified
		@GetMapping("/like_capital_city")
		public Object select(@RequestParam("val") String val) {
			return state_repository.likeCapitalCity(val);
		}
}
