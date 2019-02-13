package com.viglet.turing.persistence.repository.nlp.term;

import com.viglet.turing.persistence.model.nlp.term.TurTermAttribute;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TurTermAttributeRepository extends JpaRepository<TurTermAttribute, String> {

	List<TurTermAttribute> findAll();

	Optional<TurTermAttribute> findById(String id);

	TurTermAttribute save(TurTermAttribute turTermAttribute);

	void delete(TurTermAttribute turTermAttribute);
}
