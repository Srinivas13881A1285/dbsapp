package com.dbs.dbsapp.service;

import com.dbs.dbsapp.dao.DBFile;
import com.dbs.dbsapp.dao.repos.DBFileRepository;
import com.dbs.dbsapp.exceptions.FileStorageException;
import com.dbs.dbsapp.exceptions.model.MyFileNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class DBFileStorageService {

    @Autowired
    private DBFileRepository dbFileRepository;

    public DBFile storeFile(MultipartFile file) {

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            if (fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            DBFile dbFile = new DBFile(fileName, file.getContentType(), file.getBytes());

            return this.dbFileRepository.save(dbFile);

        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    public DBFile getFile(String fileId) {
        return dbFileRepository.
                findById(fileId).
                orElseThrow(() -> new MyFileNotFoundException("File Not Found with fileId :" + fileId));
    }
}
