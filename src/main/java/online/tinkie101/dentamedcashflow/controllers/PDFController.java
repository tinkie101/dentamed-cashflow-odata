package online.tinkie101.dentamedcashflow.controllers;

import online.tinkie101.dentamedcashflow.models.MonthlyStatement;
import online.tinkie101.dentamedcashflow.services.DocxService;
import online.tinkie101.dentamedcashflow.services.PDFService;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/pdf")
public class PDFController {
    private final PDFService pdfService;
    private final DocxService docxService;

    public PDFController(PDFService pdfService, DocxService docxService) {
        this.pdfService = pdfService;
        this.docxService = docxService;
    }

    @PostMapping("")
    public byte[] generatePdf(@RequestBody MonthlyStatement monthlyStatement) throws IOException {
        byte[] docxFile = this.docxService.getDocxFile(monthlyStatement);

        return this.pdfService.convertDocxToPdf(docxFile);
    }
}
