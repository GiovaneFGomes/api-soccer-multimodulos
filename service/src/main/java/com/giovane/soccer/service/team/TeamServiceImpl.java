package com.giovane.soccer.service.team;

import com.giovane.soccer.model.request.TeamRequestService;
import com.giovane.soccer.model.response.TeamResponseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@AllArgsConstructor
@Component
public class TeamServiceImpl implements TeamServiceFacade {

    private final TeamService teamService;

    public TeamResponseService saveTeam(TeamRequestService team) {
        return teamService.saveTeam(team);
    }

    public TeamResponseService updateTeamById(TeamRequestService team, Integer id) {
        return teamService.updateTeamById(team, id);
    }

    public void deleteTeamById(Integer id) {
        teamService.deleteTeamById(id);
    }

    public TeamResponseService findTeamById(Integer id) {
        return teamService.findTeamById(id);
    }

    public List<TeamResponseService> findAllTeams() {
        return teamService.findAllTeams();
    }

}
