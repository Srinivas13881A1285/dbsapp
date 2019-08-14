package com.dbs.dbsapp.dao.repos;

import com.dbs.dbsapp.dao.model.DBFile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBFileRepository extends CrudRepository<DBFile, String> {
}
