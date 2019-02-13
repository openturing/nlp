package com.viglet.turing.persistence.repository.nlp;

import com.viglet.turing.persistence.model.nlp.TurNLPVendor;
import com.viglet.turing.persistence.model.nlp.TurNLPVendorEntity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TurNLPVendorEntityRepository extends JpaRepository<TurNLPVendorEntity, String> {

	List<TurNLPVendorEntity> findAll();
	List<TurNLPVendorEntity> findByTurNLPVendor(TurNLPVendor turNLPVendor);
	Optional<TurNLPVendorEntity> findById(String id);

	TurNLPVendorEntity save(TurNLPVendorEntity turNLPVendorEntity);

	void delete(TurNLPVendorEntity turNLPVendorEntity);
}
