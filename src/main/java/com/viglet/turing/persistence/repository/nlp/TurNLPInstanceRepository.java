package com.viglet.turing.persistence.repository.nlp;

import com.viglet.turing.persistence.model.nlp.TurNLPInstance;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TurNLPInstanceRepository
		extends JpaRepository<TurNLPInstance, String>, TurNLPInstanceRepositoryCustom {

	List<TurNLPInstance> findAll();

	Optional<TurNLPInstance> findById(String id);

	TurNLPInstance save(TurNLPInstance turNLPInstance);

	@Modifying
	@Query("delete from  TurNLPInstance ni where ni.id = ?1")
	void delete(String id);
}
