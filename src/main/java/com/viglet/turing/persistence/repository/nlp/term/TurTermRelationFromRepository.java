package com.viglet.turing.persistence.repository.nlp.term;

import com.viglet.turing.persistence.model.nlp.term.TurTermRelationFrom;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TurTermRelationFromRepository extends JpaRepository<TurTermRelationFrom, String> {

	List<TurTermRelationFrom> findAll();

	Optional<TurTermRelationFrom> findById(String id);

	TurTermRelationFrom save(TurTermRelationFrom turTermRelationFrom);

	void delete(TurTermRelationFrom turTermRelationFrom);
}
