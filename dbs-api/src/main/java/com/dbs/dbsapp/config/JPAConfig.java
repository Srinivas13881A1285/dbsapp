package com.dbs.dbsapp.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = {"com.dbs.dbsapp.dao.model"})
@EnableJpaRepositories(basePackages = {"com.dbs.dbsapp.dao.repos"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX,
        pattern = "com.dbs.dbsapp.dao.mongo")
)
public class JPAConfig {
}