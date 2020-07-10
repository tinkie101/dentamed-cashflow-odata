package online.tinkie101.dentamedcashflow.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pdf")
public class PDFUtil {
    @PostMapping("/docxToPDF")
    public byte[] docxToPDF(@RequestBody byte[] docxFile) {
        return docxFile;
    }
}
