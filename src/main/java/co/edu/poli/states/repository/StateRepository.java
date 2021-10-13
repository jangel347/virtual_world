package co.edu.poli.states.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.edu.poli.states.model.State;

public interface StateRepository extends JpaRepository<State, Integer>{
	
	@Query(value="SELECT s.state, s.nickname, s.admission_number FROM state s WHERE capital_city LIKE CONCAT(?1,'%')",nativeQuery = true)
	List<String> likeCapitalCity(String val);
}
