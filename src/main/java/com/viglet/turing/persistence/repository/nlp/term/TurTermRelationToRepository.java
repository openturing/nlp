package com.viglet.turing.persistence.repository.nlp.term;

import com.viglet.turing.persistence.model.nlp.term.TurTermRelationTo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TurTermRelationToRepository extends JpaRepository<TurTermRelationTo, String> {

	List<TurTermRelationTo> findAll();

	Optional<TurTermRelationTo> findById(String id);

	TurTermRelationTo save(TurTermRelationTo turTermRelationTo);

	void delete(TurTermRelationTo turTermRelationTo);
}
