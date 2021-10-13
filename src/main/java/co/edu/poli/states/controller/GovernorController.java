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

import co.edu.poli.states.model.Governor;
import co.edu.poli.states.repository.GovernorRepository;

@RestController
@RequestMapping("api/governor/")
public class GovernorController {

	@Autowired
	GovernorRepository governor_repository;
	
	public GovernorController() {

	}
	
	@PostMapping("/insert")
	public Governor insertGovernor(@RequestBody Governor governor) {
		governor_repository.save(governor);
		return governor;
	}

	@PostMapping("/insert_list")
	public List<Governor> insertGovernorList(@RequestBody List<Governor> governor_list) {
		governor_repository.saveAll(governor_list);
		return governor_list;
	}

	@GetMapping("/select_all")
	public List<Governor> selectGovernors() {
		return governor_repository.findAll();
	}

	@GetMapping("/select_one")
	public Object selectGovernor(@RequestParam("id") String id) {
		return governor_repository.findById(id);
	}

	@PutMapping("/update/{id}")
	public Object updateGovernor(@PathVariable String id, @RequestBody Governor governor) {
		Governor g_update = governor_repository.getById(id);

		g_update.setName(governor.getName());
		g_update.setPolitical_party(governor.getPolitical_party());
		g_update.setState(governor.getState());

		governor_repository.save(g_update);

		return governor;
	}

	@DeleteMapping("/delete")
	public Object deleteGovernor(@RequestParam("id") String id) {
		governor_repository.deleteById(id);
		return "The governor was deleted successfully";
	}
}
