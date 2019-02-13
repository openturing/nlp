package com.viglet.turing.persistence.model.nlp;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the vigServicesNLPEntities database table.
 * 
 */
@Entity
@Table(name="turNLPVendorEntity")
@NamedQuery(name="TurNLPVendorEntity.findAll", query="SELECT nve FROM TurNLPVendorEntity nve")
public class TurNLPVendorEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "UUID", strategy = "com.viglet.turing.jpa.TurUUIDGenerator")
	@GeneratedValue(generator = "UUID")
	@Column(name = "id", updatable = false, nullable = false)
	private String id;

	@Column(nullable=false, length=255)
	private String name;

	@Column(nullable=false, length=5)
	private String language;

	//bi-directional many-to-one association to VigEntity
	@ManyToOne
	@JoinColumn(name="entity_id", nullable=false)
	private TurNLPEntity turNLPEntity;

	@ManyToOne
	@JoinColumn(name="nlp_vendor_id", nullable=false)
	private TurNLPVendor turNLPVendor;

	public TurNLPVendorEntity() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TurNLPEntity getTurNLPEntity() {
		return this.turNLPEntity;
	}

	public void setTurNLPEntity(TurNLPEntity turNLPEntity) {
		this.turNLPEntity = turNLPEntity;
	}

	public TurNLPVendor getTurNLPVendor() {
		return this.turNLPVendor;
	}

	public void setTurNLPVendor(TurNLPVendor turNLPVendor) {
		this.turNLPVendor = turNLPVendor;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
}