package io.jsd.training.webapp.trainingcenter.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Evaluation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EvaluationID id;

	@ManyToOne
	@MapsId("stagiaireId")
	@JoinColumn(name = "stagiaire_id")
	private Stagiaire stagiaire;

	@ManyToOne
	@MapsId("sessionId")
	@JoinColumn(name = "session_id")
	private Session session;

	@Temporal(TemporalType.DATE)
	private Date dateCourante;
	private Integer note;

	public Evaluation() {
		// TODO Auto-generated constructor stub
	}

	public Evaluation(EvaluationID id, Stagiaire stagiaire,
			Session session, Date dateCourante, Integer note) {
		super();
		this.id = id;
		this.stagiaire = stagiaire;
		this.session = session;
		this.dateCourante = dateCourante;
		this.note = note;
	}

	@Override
	public String toString() {
		return "Evaluation [id=" + id + ", stagiaire=" + stagiaire
				+ ", session=" + session + ", dateCourante=" + dateCourante
				+ ", note=" + note + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((session == null) ? 0 : session.hashCode());
		result = prime * result
				+ ((stagiaire == null) ? 0 : stagiaire.hashCode());
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
		Evaluation other = (Evaluation) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (session == null) {
			if (other.session != null)
				return false;
		} else if (!session.equals(other.session))
			return false;
		if (stagiaire == null) {
			if (other.stagiaire != null)
				return false;
		} else if (!stagiaire.equals(other.stagiaire))
			return false;
		return true;
	}

	public EvaluationID getId() {
		return id;
	}

	public void setId(EvaluationID id) {
		this.id = id;
	}

	public Stagiaire getStagiaire() {
		return stagiaire;
	}

	public void setStagiaire(Stagiaire stagiaire) {
		this.stagiaire = stagiaire;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Date getDateCourante() {
		return dateCourante;
	}

	public void setDateCourante(Date dateCourante) {
		this.dateCourante = dateCourante;
	}

	public Integer getNote() {
		return note;
	}

	public void setNote(Integer note) {
		this.note = note;
	}

}
