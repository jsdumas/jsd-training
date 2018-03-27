package io.jsd.training;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
@RestResource(path = "teams", rel = "team")
interface TeamRepository extends CrudRepository<Team, Long> {

}
