package co.edu.poli.states.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "country")
public class Country {

	@Id
	private String code;
	private String name;
	private String alternative_names;
	private String coordinates;
	@OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<State> states;

	public Country(String code, String name, String alternative_names, String coordinates,
			List<State> states) {
		super();
		this.code = code;
		this.name = name;
		this.alternative_names = alternative_names;
		this.coordinates = coordinates;
		this.states = states;
	}
	
	public Country(String code, String name, String alternative_names, String coordinates) {
		super();
		this.code = code;
		this.name = name;
		this.alternative_names = alternative_names;
		this.coordinates = coordinates;
	}

	public Country() {
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlternative_names() {
		return alternative_names;
	}

	public void setAlternative_names(String alternative_names) {
		this.alternative_names = alternative_names;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}
	
	
}
