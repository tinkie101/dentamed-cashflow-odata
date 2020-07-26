package online.tinkie101.dentamedcashflow.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app.docx.server")
public class DocxConfig {
    private final String baseUrl = "http://localhost:3000";

    public String getBaseUrl() {
        return this.baseUrl;
    }
}
