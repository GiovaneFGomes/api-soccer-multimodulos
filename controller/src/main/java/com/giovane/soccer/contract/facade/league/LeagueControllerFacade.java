package com.giovane.soccer.contract.facade.league;

import com.giovane.soccer.model.league.request.LeagueRequestController;
import com.giovane.soccer.model.league.response.LeagueResponseController;
import java.util.List;

public interface LeagueControllerFacade {

    LeagueResponseController saveLeague(LeagueRequestController league);

    LeagueResponseController updateLeagueById(LeagueRequestController league, Integer id);

    void deleteLeagueById(Integer id);

    LeagueResponseController findLeagueById(Integer id);

    List<LeagueResponseController> findAllLeagues();

}

