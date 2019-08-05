package com.dbs.dbsapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"com.dbs.dbsapp.dao.mongo.repos"})
public class DbsMongoConfig {

}