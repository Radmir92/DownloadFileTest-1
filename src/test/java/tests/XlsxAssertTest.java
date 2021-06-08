package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readXlsxFromPath;

public class XlsxAssertTest {
    @Test
    void xlsxAssertTest() throws IOException {
        String xlsxFilePath = "./src/test/resources/files/1.xlsx";
        String expectedText = "Крокодилы ходят";

        String actualData = readXlsxFromPath(xlsxFilePath);
        assertThat(actualData, containsString(expectedText));

    }
}
