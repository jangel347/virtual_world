package co.edu.poli.states.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "governor")
public class Governor {

	@Id
	private String id;
	private String name;
	private String political_party;

	@OneToOne
	private State state;

	public Governor(String id, String name, String political_party, State state) {
		super();
		this.id = id;
		this.name = name;
		this.political_party = political_party;
		this.state = state;
	}

	public Governor() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPolitical_party() {
		return political_party;
	}

	public void setPolitical_party(String political_party) {
		this.political_party = political_party;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
