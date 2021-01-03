package online.tinkie101.dentamedcashflow.config;

import fr.opensagres.poi.xwpf.converter.core.IXWPFConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PDFConfig {
    @Bean
    public IXWPFConverter<PdfOptions> pdfConverter() {
        return PdfConverter.getInstance();
    }

    @Bean
    public PdfOptions pdfOptions() {
        return PdfOptions.create();
    }
}
