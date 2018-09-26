package com.fileUpload.fileUploadApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import com.fileUpload.model.FileStorageProperties;

@SpringBootApplication
@ComponentScan(basePackages = "com.*")
@EnableConfigurationProperties({ FileStorageProperties.class })
public class FileuploadAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileuploadAppApplication.class, args);
		System.out.println("hii in file upload demo");
	}
}
