package io.jsd.training.dao;

import org.springframework.data.repository.CrudRepository;

import io.jsd.training.entity.Team;

interface TeamRepository extends CrudRepository<Team, Long> {

}
