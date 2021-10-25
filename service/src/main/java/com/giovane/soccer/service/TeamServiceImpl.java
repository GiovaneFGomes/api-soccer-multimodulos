package com.giovane.soccer.service;

import com.giovane.soccer.LeagueClient;
import com.giovane.soccer.model.request.TeamRequestService;
import com.giovane.soccer.model.response.TeamResponseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@AllArgsConstructor
@Component
public class TeamServiceImpl implements TeamServiceFacade {

    private final TeamService service;

    public TeamResponseService saveTeam(TeamRequestService team) {
        return service.saveTeam(team);
    }

    public TeamResponseService updateTeamById(TeamRequestService team, Integer id) {
        return service.updateTeamById(team, id);
    }

    public void deleteTeamById(Integer id) {
        service.deleteTeamById(id);
    }

    public TeamResponseService findTeamById(Integer id) {
        return service.findTeamById(id);
    }

    public List<TeamResponseService> findAllTeams() {
        return service.findAllTeams();
    }

}
