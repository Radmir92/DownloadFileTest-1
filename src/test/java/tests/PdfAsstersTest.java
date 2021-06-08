package tests;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static utils.Files.getPdf;

public class PdfAsstersTest {
    public class PdfAssertsTest {
        @Test
        void pdfAssertTest() throws IOException {
            String pdfFilePath = "./src/test/resources/files/1.pdf";
            String expectedText = "Крокодилы ходят";

            PDF pdf = getPdf(pdfFilePath);
            assertThat(pdf, PDF.containsText(expectedText));
        }
    }
}