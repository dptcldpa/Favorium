package com.dptcldpa.favorium.common;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.multipart.MultipartFile;

public class FileManager {

	public final static String FILE_UPLOAD_PATH = "/home/ec2-user/upload/favorium";
	
	public static String saveFile(int userId, MultipartFile photo) {
			
		String directoryName = "/" + userId + "_" + System.currentTimeMillis();
		
		String directoryPath = FILE_UPLOAD_PATH + directoryName;
		
		File directory = new File(directoryPath);
		
		if(!directory.mkdir()) {
			return null;
		}
		
		String photoPath = directoryPath + "/" + photo.getOriginalFilename();
		
		try {
			byte[] bytes = photo.getBytes();
			Path path = Paths.get(photoPath);
			
			Files.write(path, bytes);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
			return null;
			
		}
		
		return "/images" + directoryName + "/" + photo.getOriginalFilename();
			
	}
	
}
