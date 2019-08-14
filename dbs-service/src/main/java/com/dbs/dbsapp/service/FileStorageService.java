package com.dbs.dbsapp.service;

import com.dbs.dbsapp.dao.model.UploadFileResponse;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {
    String storeFile(MultipartFile file);

//    String getFilenameAndExtension(String filename);

    Resource loadFileAsResource(String fileName);
}
