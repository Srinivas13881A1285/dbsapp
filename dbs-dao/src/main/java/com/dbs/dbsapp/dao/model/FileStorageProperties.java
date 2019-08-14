package com.dbs.dbsapp.dao.model;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author EPAM
 */
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    private String uploadDir;

    /**
     * @return
     */
    public String getUploadDir() {
        return uploadDir;
    }

    /**
     * @param uploadDir
     */
    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }
}