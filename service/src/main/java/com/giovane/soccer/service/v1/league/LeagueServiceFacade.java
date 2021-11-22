package com.giovane.soccer.service.v1.league;

import com.giovane.soccer.service.model.league.request.LeagueRequestService;
import com.giovane.soccer.service.model.league.response.LeagueResponseService;
import java.util.List;

public interface LeagueServiceFacade {

    LeagueResponseService saveLeague(LeagueRequestService league);

    LeagueResponseService updateLeagueById(LeagueRequestService league, Integer id);

    void deleteLeagueById(Integer id);

    LeagueResponseService findLeagueById(Integer id);

    List<LeagueResponseService> findAllLeagues();

}
