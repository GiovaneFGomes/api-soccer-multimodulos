package com.giovane.soccer.service;

import com.giovane.soccer.LeagueClient;
import com.giovane.soccer.model.League;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class LeagueService {

    private final LeagueClient client;

    public League findLeagues() {
        String url = "https://app.sportdataapi.com/api/v1/soccer/leagues?apikey=d2541920-262e-11ec-ae9c-bdef304d5055&country_id=25";
        return client.getRestTemplate().getForObject(url, League.class);
    }


}
