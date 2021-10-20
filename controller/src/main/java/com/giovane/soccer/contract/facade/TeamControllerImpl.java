package com.giovane.soccer.contract.facade;

import com.giovane.soccer.mapper.request.TeamRequestMapper;
import com.giovane.soccer.mapper.response.TeamResponseMapper;
import com.giovane.soccer.model.request.TeamRequestController;
import com.giovane.soccer.model.request.TeamRequestService;
import com.giovane.soccer.model.response.TeamResponseController;
import com.giovane.soccer.model.response.TeamResponseService;
import com.giovane.soccer.service.team.TeamServiceFacade;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@AllArgsConstructor
@Component
public class TeamControllerImpl implements TeamControllerFacade {

    private final TeamServiceFacade facade;

    public TeamResponseController saveTeam(TeamRequestController team) {
        TeamRequestService teamService = TeamRequestMapper.toTeamService(team);
        TeamResponseService teamController = facade.saveTeam(teamService);
        return TeamResponseMapper.toControllerResponse(teamController);
    }

    public TeamResponseController updateTeamById(TeamRequestController team, Integer id) {
        TeamRequestService teamService = TeamRequestMapper.toTeamService(team);
        TeamResponseService teamController = facade.updateTeamById(teamService, id);
        return TeamResponseMapper.toControllerResponse(teamController);
    }

    public void deleteTeamById(Integer id) {
        facade.deleteTeamById(id);
    }

    public TeamResponseController findTeamById(Integer id) {
        TeamResponseService teamController = facade.findTeamById(id);
        return TeamResponseMapper.toControllerResponse(teamController);
    }

    public List<TeamResponseController> findAllTeams() {
        return facade.findAllTeams().stream()
                .map(TeamResponseMapper::toControllerResponse)
                .toList();
    }

}
