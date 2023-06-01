package com.huoyan;

/**
 * @author : wuxiao
 * @date : 11:52 2022/12/14
 */

import com.ruoyi.RuoYiApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Base64;

/**
 * @author
 * @date 2022/9/19 8:25
 * @remark
 */

@SpringBootTest(classes = RuoYiApplication .class)
public class TestTime3 {
    public static String saveBase64Image(String base64String, String saveDirectory, String fileName) {
        try {
            // Decode the base64 string to image data
            byte[] imageData = Base64.getDecoder().decode(base64String);

            // Create the save directory if it doesn't exist
            Path directoryPath = Paths.get(saveDirectory);
            if (!Files.exists(directoryPath)) {
                Files.createDirectories(directoryPath);
            }

            // Construct the complete file path
            Path filePath = directoryPath.resolve(fileName);

            // Save the image file to the specified path
            Files.write(filePath, imageData, StandardOpenOption.CREATE);

            System.out.println("Image saved successfully.");

            // Return the complete file path
            return filePath.toString();
        } catch (IOException e) {
            System.err.println("An error occurred while saving the image: " + e.getMessage());
            return null;
        }
    }
    @Test
    public void testhourTime3(){
        String base64String = "Your base64-encoded image string";
        String saveDirectory = "/path/to/save";
        String fileName = "image.png";

        String filePath = saveBase64Image(base64String, saveDirectory, fileName);
        if (filePath != null) {
            System.out.println("Image saved to: " + filePath);
        }    }
}
