package co.edu.poli.states.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "state")
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String state;
	private String slug;
	private String code;
	private String nickname;
	private String website;
	private LocalDate admission_date;
	private Integer admission_number;
	private String capital_city;
	private String capital_url;
	private Long population;
	private Integer population_rank;
	private String constitution_url;
	private String state_flag_url;
	private String state_seal_url;
	private String map_image_url;
	private String landscape_background_url;
	private String skyline_background_url;
	private String twitter_url;
	private String facebook_url;
	
	@OneToOne
    @JoinColumn(name="governor_id")
	private Governor governor;
	
	@ManyToOne
	@JoinColumn(name="country_id")
	private Country country;

	public State(Integer id, String state, String slug, String code, String nickname, String website,
			LocalDate admission_date, Integer admission_number, String capital_city, String capital_url, Long population,
			Integer population_rank, String constitution_url, String state_flag_url, String state_seal_url,
			String map_image_url, String landscape_background_url, String skyline_background_url, String twitter_url,
			String facebook_url, Governor governor, Country country) {
		super();
		this.id = id;
		this.state = state;
		this.slug = slug;
		this.code = code;
		this.nickname = nickname;
		this.website = website;
		this.admission_date = admission_date;
		this.admission_number = admission_number;
		this.capital_city = capital_city;
		this.capital_url = capital_url;
		this.population = population;
		this.population_rank = population_rank;
		this.constitution_url = constitution_url;
		this.state_flag_url = state_flag_url;
		this.state_seal_url = state_seal_url;
		this.map_image_url = map_image_url;
		this.landscape_background_url = landscape_background_url;
		this.skyline_background_url = skyline_background_url;
		this.twitter_url = twitter_url;
		this.facebook_url = facebook_url;
		this.governor = governor;
		this.country = country;
	}

	public State() {
		super();
	}
	
	public State(String state) {
		super();
		this.state = state;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public LocalDate getAdmission_date() {
		return admission_date;
	}

	public void setAdmission_date(LocalDate admission_date) {
		this.admission_date = admission_date;
	}

	public Integer getAdmission_number() {
		return admission_number;
	}

	public void setAdmission_number(Integer admission_number) {
		this.admission_number = admission_number;
	}

	public String getCapital_city() {
		return capital_city;
	}

	public void setCapital_city(String capital_city) {
		this.capital_city = capital_city;
	}

	public String getCapital_url() {
		return capital_url;
	}

	public void setCapital_url(String capital_url) {
		this.capital_url = capital_url;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public Integer getPopulation_rank() {
		return population_rank;
	}

	public void setPopulation_rank(Integer population_rank) {
		this.population_rank = population_rank;
	}

	public String getConstitution_url() {
		return constitution_url;
	}

	public void setConstitution_url(String constitution_url) {
		this.constitution_url = constitution_url;
	}

	public String getState_flag_url() {
		return state_flag_url;
	}

	public void setState_flag_url(String state_flag_url) {
		this.state_flag_url = state_flag_url;
	}

	public String getState_seal_url() {
		return state_seal_url;
	}

	public void setState_seal_url(String state_seal_url) {
		this.state_seal_url = state_seal_url;
	}

	public String getMap_image_url() {
		return map_image_url;
	}

	public void setMap_image_url(String map_image_url) {
		this.map_image_url = map_image_url;
	}

	public String getLandscape_background_url() {
		return landscape_background_url;
	}

	public void setLandscape_background_url(String landscape_background_url) {
		this.landscape_background_url = landscape_background_url;
	}

	public String getSkyline_background_url() {
		return skyline_background_url;
	}

	public void setSkyline_background_url(String skyline_background_url) {
		this.skyline_background_url = skyline_background_url;
	}

	public String getTwitter_url() {
		return twitter_url;
	}

	public void setTwitter_url(String twitter_url) {
		this.twitter_url = twitter_url;
	}

	public String getFacebook_url() {
		return facebook_url;
	}

	public void setFacebook_url(String facebook_url) {
		this.facebook_url = facebook_url;
	}

	public Governor getGovernor() {
		return governor;
	}

	public void setGovernor(Governor governor) {
		this.governor = governor;
	}
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
