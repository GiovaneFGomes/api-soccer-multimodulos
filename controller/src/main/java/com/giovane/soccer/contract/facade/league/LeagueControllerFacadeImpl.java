package com.giovane.soccer.contract.facade.league;

import com.giovane.soccer.facade.league.LeagueServiceFacade;
import com.giovane.soccer.mapper.league.response.LeagueControllerResponseMapper;
import com.giovane.soccer.model.league.request.LeagueRequestController;
import com.giovane.soccer.model.league.request.LeagueRequestService;
import com.giovane.soccer.model.league.response.LeagueResponseController;
import com.giovane.soccer.model.league.response.LeagueResponseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
import static com.giovane.soccer.mapper.league.request.LeagueControllerRequestMapper.toLeagueService;
import static com.giovane.soccer.mapper.league.response.LeagueControllerResponseMapper.toLeagueControllerResponse;

@AllArgsConstructor
@Component
public class LeagueControllerFacadeImpl implements LeagueControllerFacade{

    private final LeagueServiceFacade facade;

    public LeagueResponseController saveLeague(LeagueRequestController league) {
        LeagueRequestService leagueSave = toLeagueService(league);
        LeagueResponseService leagueResponse = facade.saveLeague(leagueSave);
        return toLeagueControllerResponse(leagueResponse);
    }

    public LeagueResponseController updateLeagueById(LeagueRequestController league, Integer id) {
        LeagueRequestService leagueUpdate = toLeagueService(league);
        LeagueResponseService leagueResponse = facade.updateLeagueById(leagueUpdate, id);
        return toLeagueControllerResponse(leagueResponse);
    }

    public void deleteLeagueById(Integer id) {
        facade.deleteLeagueById(id);
    }

    public LeagueResponseController findLeagueById(Integer id) {
        LeagueResponseService leagueResponse = facade.findLeagueById(id);
        return toLeagueControllerResponse(leagueResponse);
    }

    public List<LeagueResponseController> findAllLeagues() {
        return facade.findAllLeagues().stream()
                .map(LeagueControllerResponseMapper::toLeagueControllerResponse)
                .toList();
    }

}
