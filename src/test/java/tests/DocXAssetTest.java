package tests;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readDocxFile;

public class DocXAssetTest {
    public class DocxAssertTest {

        @Test
        void docxAssertTest() throws IOException {
            String docFilePath = "./src/test/resources/files/1.docx";
            String expectedText = "crocodiles walk";

            String actualData = readDocxFile(docFilePath);
            assertThat(actualData, containsString(expectedText));

        }
    }
}
