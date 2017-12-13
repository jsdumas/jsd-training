package io.jsd.training.webapp.petclinic.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import io.jsd.training.webapp.petclinic.dao.entity.Message;


public interface MessageDAO extends JpaRepository<Message, Integer> {

}
