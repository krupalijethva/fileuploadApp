package com.fileUpload.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fileUpload.model.UploadFileResponse;
import com.fileUpload.service.fileStorageService;


@RestController
public class FileController {
	
	
	@Autowired
    private fileStorageService fileStorageService;
		
    @PostMapping("/uploadFile")
   // @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    public HashMap<String,String> uploadFile(@RequestParam("file") MultipartFile file) {
    	
    	
    	System.out.println(file);
		  HashMap<String,String> metamap=new HashMap<String,String>();
		  
		  String fileName = fileStorageService.storeFile(file);
		  
		  System.out.println(fileName);
		  metamap.put("fileName", fileName);
		  
		  return metamap;
//        String fileName = fileStorageService.storeFile(file);
//        
//        System.out.println("in upload file "+fileName);
//        
//        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
//                .path("/downloadFile")
//                .path(fileName)
//                .toUriString();
//
//        return new UploadFileResponse(fileName, fileDownloadUri,
//                file.getContentType(), file.getSize());
    }

    
    @GetMapping("/hi")
    public String hi(){
		return "Hi !!";
    }
}
