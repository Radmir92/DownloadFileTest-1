package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.readDocFile;

public class DocAssertTest {

        @Test
        void docAssertTest() throws IOException {
            String docFilePath = "./src/test/resources/files/1.doc";
            String expectedText = "crocodiles walk";
            String actualData = readDocFile(docFilePath);
            assertThat(actualData, containsString(expectedText));
        }
    }


