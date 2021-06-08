package tests;

import org.apache.xpath.operations.String;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.zip.ZipException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromPath;
import static utils.Zip.unzip;

public class ZipAssertTest {
    @Test
    void zipAssertTest() throws IOException, ZipException {
        java.lang.String zipFilePath = "./src/test/resources/files/1.zip";
        String unzipFolderPath = "./src/test/resources/files/unzip";
        String zipPassword = "";
        String unzipTxtFilePath = "./src/test/resources/files/unzip/1.txt";
        String expectedText = "Крокодилы ходят";

        unzip(zipFilePath, unzipFolderPath, zipPassword);
        String actualText = readTextFromPath(unzipTxtFilePath);
        assertThat(actualText, containsString(expectedText));
    }
}