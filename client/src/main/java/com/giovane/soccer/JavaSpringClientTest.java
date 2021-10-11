package com.giovane.soccer;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class JavaSpringClientTest {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplateBuilder()
                .rootUri("Http://localhost:8080/api/v1/soccer")
                .build();
    }
}
