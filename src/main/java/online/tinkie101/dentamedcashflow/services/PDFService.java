package online.tinkie101.dentamedcashflow.services;

import fr.opensagres.poi.xwpf.converter.core.IXWPFConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Service
public class PDFService {
    private final IXWPFConverter<PdfOptions> pdfConverter;
    private final PdfOptions options;

    public PDFService(IXWPFConverter<PdfOptions> pdfConverter, PdfOptions options) {
        this.pdfConverter = pdfConverter;
        this.options = options;
    }

    public byte[] convertDocxToPdf(byte[] docxFile) throws IOException {
        InputStream doc = new ByteArrayInputStream(docxFile);
        XWPFDocument document = new XWPFDocument(doc);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        this.pdfConverter.convert(document, out, this.options);

        return out.toByteArray();
    }
}
