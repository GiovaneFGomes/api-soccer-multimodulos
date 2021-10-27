package com.giovane.soccer.service;

import com.giovane.soccer.model.entity.League;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
@Service
public class LeagueService {
    public void findLeague() {
        RestTemplate template = new RestTemplate();
        String url = "https://app.sportdataapi.com/api/v1/soccer/leagues?apikey=d2541920-262e-11ec-ae9c-bdef304d5055&country_id=25";
        template.getForObject(url, League.class);
    }
}
