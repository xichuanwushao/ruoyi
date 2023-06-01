package com.huoyan;

/**
 * @author : wuxiao
 * @date : 11:52 2022/12/14
 */

import com.ruoyi.RuoYiApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
/**
 * @author
 * @date 2022/9/19 8:25
 * @remark
 */

@SpringBootTest(classes = RuoYiApplication .class)
public class TestTime2 {

    @Test
    public void testhourTime3(){
        String imagePath = "D:/ruoyi/uploadPath/upload/2023/06/01/微信图片_20221015171852_20230601144607A001.jpg";  // Replace with the actual image file path

        String base64String = convertImageToBase64(imagePath);
        if (base64String != null) {
            System.out.println("Base64-encoded image:");
            System.out.println(base64String);
        }
    }

    public static String convertImageToBase64(String imagePath) {
        try {
            // Read the image file as bytes
            byte[] imageBytes = Files.readAllBytes(Paths.get(imagePath));

            // Convert the image bytes to a base64-encoded string
            String base64String = Base64.getEncoder().encodeToString(imageBytes);

            return base64String;
        } catch (Exception e) {
            System.err.println("An error occurred while converting the image to base64: " + e.getMessage());
            return null;
        }
    }
}
