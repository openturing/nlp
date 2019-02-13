package com.viglet.turing.persistence.repository.nlp.term;

import com.viglet.turing.persistence.model.nlp.term.TurTermVariationLanguage;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TurTermVariationLanguageRepository extends JpaRepository<TurTermVariationLanguage, String> {

	List<TurTermVariationLanguage> findAll();

	Optional<TurTermVariationLanguage> findById(String id);

	TurTermVariationLanguage save(TurTermVariationLanguage turTermVariationLanguage);

	void delete(TurTermVariationLanguage turTermVariationLanguage);
}
