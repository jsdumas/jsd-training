package io.jsd.training.webapp.petclinic.dao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Vaccin implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String type;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date inoculation;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date rappel;
	
	private Boolean emailSent = false;
	
	@ManyToOne
	@JoinColumn(nullable=false)
	private Animal animal;
	
	public Vaccin() {
		super();
	}

	public Vaccin(String type, Date inoculation, Date rappel) {
		super();
		this.type = type;
		this.inoculation = inoculation;
		this.rappel = rappel;
	}

	public Vaccin(Integer id, String type, Date inoculation, Date rappel) {
		super();
		this.id = id;
		this.type = type;
		this.inoculation = inoculation;
		this.rappel = rappel;
	}
	

	public Vaccin(Integer id, String type, Date inoculation, Date rappel,
			Animal animal) {
		super();
		this.id = id;
		this.type = type;
		this.inoculation = inoculation;
		this.rappel = rappel;
		this.animal = animal;
	}
	
	public Vaccin(Integer id, String type, Date inoculation, Date rappel,
			Boolean emailSent, Animal animal) {
		super();
		this.id = id;
		this.type = type;
		this.inoculation = inoculation;
		this.rappel = rappel;
		this.emailSent = emailSent;
		this.animal = animal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getInoculation() {
		return inoculation;
	}

	public void setInoculation(Date inoculation) {
		this.inoculation = inoculation;
	}

	public Date getRappel() {
		return rappel;
	}

	public void setRappel(Date rappel) {
		this.rappel = rappel;
	}

	public Boolean getEmailSent() {
		return emailSent;
	}

	public void setEmailSent(Boolean emailSent) {
		this.emailSent = emailSent;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animal == null) ? 0 : animal.hashCode());
		result = prime * result
				+ ((emailSent == null) ? 0 : emailSent.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((inoculation == null) ? 0 : inoculation.hashCode());
		result = prime * result + ((rappel == null) ? 0 : rappel.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vaccin other = (Vaccin) obj;
		if (animal == null) {
			if (other.animal != null)
				return false;
		} else if (!animal.equals(other.animal))
			return false;
		if (emailSent == null) {
			if (other.emailSent != null)
				return false;
		} else if (!emailSent.equals(other.emailSent))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inoculation == null) {
			if (other.inoculation != null)
				return false;
		} else if (!inoculation.equals(other.inoculation))
			return false;
		if (rappel == null) {
			if (other.rappel != null)
				return false;
		} else if (!rappel.equals(other.rappel))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vaccin [id=" + id + ", type=" + type + ", inoculation="
				+ inoculation + ", rappel=" + rappel + ", emailSent="
				+ emailSent + ", animal=" + animal + "]";
	}
}
