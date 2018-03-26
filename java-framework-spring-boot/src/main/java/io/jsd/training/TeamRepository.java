package io.jsd.training;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface TeamRepository extends CrudRepository<Team, Long> {

}
