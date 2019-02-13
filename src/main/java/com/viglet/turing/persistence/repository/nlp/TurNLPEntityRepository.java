package com.viglet.turing.persistence.repository.nlp;

import com.viglet.turing.persistence.model.nlp.TurNLPEntity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TurNLPEntityRepository extends JpaRepository<TurNLPEntity, String> {

	List<TurNLPEntity> findAll();

	Optional<TurNLPEntity> findById(String id);

	TurNLPEntity findByInternalName(String internalName);
	
	List<TurNLPEntity> findByLocal(int local);
	
	TurNLPEntity findByName(String name);

	TurNLPEntity save(TurNLPEntity turNLPEntity);

	void delete(TurNLPEntity turNLPEntity);
}
