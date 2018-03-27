package io.jsd.training;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
interface TeamRepository extends CrudRepository<Team, Long> {

}
