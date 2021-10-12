package com.giovane.soccer.resttemplate;

import com.giovane.soccer.entity.LeaguesClient;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@AllArgsConstructor
public class ConsumerApi {

    private final RestTemplate template;

    //https://app.sportdataapi.com/api/v1/soccer/leagues?apikey=d2541920-262e-11ec-ae9c-bdef304d5055&country_id=25

    public void consumingApi(){

        UriComponents uri = UriComponentsBuilder.newInstance()
                .scheme("https")
                .host("app.sportdataapi.com")
                .path("api/v1/soccer/leagues")
                .queryParam("apikey", "d2541920-262e-11ec-ae9c-bdef304d5055")
                .queryParam("country_id", "25")
                .build();

        ResponseEntity<LeaguesClient> entity = template.getForEntity(uri.toString(), LeaguesClient.class);

        System.out.println(entity.getBody().getName());
    }

}
