package com.viglet.turing.persistence.repository.nlp.term;

import com.viglet.turing.persistence.model.nlp.term.TurTermVariation;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TurTermVariationRepository extends JpaRepository<TurTermVariation, String> {

	List<TurTermVariation> findAll();

	Optional<TurTermVariation> findById(String id);

	TurTermVariation save(TurTermVariation turTermVariation);

	void delete(TurTermVariation turTermVariation);
}
