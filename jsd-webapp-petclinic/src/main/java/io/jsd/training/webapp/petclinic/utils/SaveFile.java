package io.jsd.training.webapp.petclinic.utils;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import org.springframework.web.multipart.MultipartFile;

public class SaveFile {

	public static Boolean handleFileUpload(
             MultipartFile file, String newFilePAth){
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes(); 
                
                BufferedOutputStream stream =
                        new BufferedOutputStream(new FileOutputStream(newFilePAth));
                stream.write(bytes);
                stream.close();
                return true;
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
    }
	
}
