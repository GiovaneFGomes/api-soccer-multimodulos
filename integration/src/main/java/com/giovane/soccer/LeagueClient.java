package com.giovane.soccer;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
@Configuration
public class LeagueClient {

    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

//    public void consumerApi() {
//
//        RestTemplate template = new RestTemplate();
//
//        UriComponents uri = UriComponentsBuilder.newInstance()
//                .scheme("https")
//                .host("app.sportdataapi.com")
//                .path("api/v1/soccer/leagues")
//                .queryParam("apikey", "d2541920-262e-11ec-ae9c-bdef304d5055")
//                .queryParam("country_id", "25")
//                .build();
//
//        template.getForEntity(uri.toString(), League.class);
//    }

}
