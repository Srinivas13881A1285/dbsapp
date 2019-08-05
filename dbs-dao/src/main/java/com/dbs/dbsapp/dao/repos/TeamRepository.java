package com.dbs.dbsapp.dao.repos;

import com.dbs.dbsapp.dao.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team,Long> {
}
