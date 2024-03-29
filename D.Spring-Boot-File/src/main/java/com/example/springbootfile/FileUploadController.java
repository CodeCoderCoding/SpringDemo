package com.example.springbootfile;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author CodeCoderCoding
 */
@RestController
public class FileUploadController {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/");

    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest req) {
        String realPath = req.getSession().getServletContext().getRealPath("/uploadFile/");
        System.out.println(realPath);
        String format = sdf.format(new Date());
        File folder = new File(realPath + format);
        if (!folder.isDirectory()) {
            folder.mkdirs();
        }
        String oldName = uploadFile.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());
        try {
            uploadFile.transferTo(new File(folder, newName));
            String filePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/uploadFile/" + format + newName;
            return filePath;
        } catch (IOException e) {
//            e.printStackTrace();
        }
        return "上传失败!";
    }

    @PostMapping("/uploads")
    public String upload(MultipartFile[] uploadFiles, HttpServletRequest req) {
        for (MultipartFile uploadFile : uploadFiles) {
            String realPath = req.getSession().getServletContext().getRealPath("/uploadFile/");
            System.out.println(realPath);
            String format = sdf.format(new Date());
            File folder = new File(realPath + format);
            if (!folder.isDirectory()) {
                folder.mkdirs();
            }
            String oldName = uploadFile.getOriginalFilename();
            String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());
            try {
                uploadFile.transferTo(new File(folder, newName));
                String filePath = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + "/uploadFile/" + format + newName;
//            return filePath;
                System.out.println(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "上传失败!";
    }
}
