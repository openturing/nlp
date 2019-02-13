package com.viglet.turing.persistence.repository.nlp;

import com.viglet.turing.persistence.model.nlp.TurNLPFeature;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TurNLPFeatureRepository extends JpaRepository<TurNLPFeature, String> {

	List<TurNLPFeature> findAll();

	Optional<TurNLPFeature> findById(String id);

	TurNLPFeature save(TurNLPFeature turNLPFeature);

	void delete(TurNLPFeature turNLPFeature);
}
