package online.tinkie101.dentamedcashflow.controllers;

import online.tinkie101.dentamedcashflow.services.PDFService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/pdf")
public class PDFController {

    private final PDFService pdfService;

    public PDFController(PDFService pdfService) {
        this.pdfService = pdfService;
    }

    @PostMapping("/docxToPdf")
    public byte[] docxToPdf(@RequestBody byte[] docxFile) throws IOException {
        return this.pdfService.convertDocxToPdf(docxFile);
    }
}
