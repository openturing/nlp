package com.viglet.turing.persistence.repository.nlp;

import com.viglet.turing.persistence.model.nlp.TurNLPInstance;
import com.viglet.turing.persistence.model.nlp.TurNLPInstanceEntity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TurNLPInstanceEntityRepository
		extends JpaRepository<TurNLPInstanceEntity, String> {

	List<TurNLPInstanceEntity> findAll();

	List<TurNLPInstanceEntity> findByTurNLPInstanceAndLanguage(TurNLPInstance turNLPInstance, String Language);

	List<TurNLPInstanceEntity> findByTurNLPInstanceAndLanguageAndEnabled(TurNLPInstance turNLPInstance, String Language,
			int enabled);

	default List<TurNLPInstanceEntity> findByTurNLPInstance(TurNLPInstance turNLPInstance) {
		return findByTurNLPInstanceAndLanguage(turNLPInstance, turNLPInstance.getLanguage());
	}

	default List<TurNLPInstanceEntity> findByTurNLPInstanceAndEnabled(TurNLPInstance turNLPInstance, int enabled) {
		return findByTurNLPInstanceAndLanguageAndEnabled(turNLPInstance, turNLPInstance.getLanguage(), enabled);
	}

	Optional<TurNLPInstanceEntity> findById(String id);

	TurNLPInstanceEntity save(TurNLPInstanceEntity turNLPInstanceEntity);

	void delete(TurNLPInstanceEntity turNLPInstanceEntity);
}
