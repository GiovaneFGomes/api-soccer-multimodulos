package com.giovane.soccer.service;

import com.giovane.soccer.satelite.Satelite;
import lombok.AllArgsConstructor;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
@Service
public class SateliteService {

    public void findSatelite(){
        RestTemplate template = new RestTemplate();
        RestTemplateBuilder templateBuilder = new RestTemplateBuilder();

        template = templateBuilder.build();
        Satelite satelite = template
                .getForObject("https://api.wheretheiss.at/v1/satellites/25544", Satelite.class);

    }

}
