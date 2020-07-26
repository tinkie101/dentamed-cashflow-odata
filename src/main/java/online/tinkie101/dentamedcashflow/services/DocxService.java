package online.tinkie101.dentamedcashflow.services;

import online.tinkie101.dentamedcashflow.config.DocxConfig;
import online.tinkie101.dentamedcashflow.models.MonthlyStatement;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class DocxService {
    private final WebClient webclient;

    public DocxService(DocxConfig docxConfig) {
        this.webclient = WebClient
                .builder()
                .baseUrl(docxConfig.getBaseUrl())
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    public byte[] getDocxFile(MonthlyStatement monthlyStatement) {
        Mono<byte[]> data = this.webclient
                .post()
                .uri("/generateDocx")
                .body(Mono.just(monthlyStatement), MonthlyStatement.class)
                .retrieve()
                .bodyToMono(byte[].class);

        return data.block();
    }
}
