package com.viglet.turing.persistence.repository.nlp.term;

import com.viglet.turing.persistence.model.nlp.term.TurTerm;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TurTermRepository extends JpaRepository<TurTerm, String> {

	List<TurTerm> findAll();
	
	TurTerm findOneByIdCustom(String idCustom);
	
	Optional<TurTerm> findById(String id);

	TurTerm save(TurTerm turTerm);

	@Modifying
	@Query("delete from TurTerm t where t.id = ?1")
	void delete(String id);
}
