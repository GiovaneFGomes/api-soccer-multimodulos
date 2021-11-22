package com.giovane.soccer.contract.v1.team;

import com.giovane.soccer.contract.mapper.response.TeamControllerResponseMapper;
import com.giovane.soccer.contract.model.response.TeamResponseController;
import com.giovane.soccer.contract.model.request.TeamRequestController;
import com.giovane.soccer.service.v1.team.TeamFacade;
import com.giovane.soccer.service.model.team.request.TeamRequestService;
import com.giovane.soccer.service.model.team.response.TeamResponseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;
import static com.giovane.soccer.contract.mapper.request.TeamControllerRequestMapper.toTeamService;
import static com.giovane.soccer.contract.mapper.response.TeamControllerResponseMapper.toTeamControllerResponse;

@AllArgsConstructor
@Component
public class TeamControllerFacade {

    private final TeamFacade facade;

    public TeamResponseController saveTeam(TeamRequestController team) {
        TeamRequestService teamSave = toTeamService(team);
        TeamResponseService teamResponse = facade.saveTeam(teamSave);
        return toTeamControllerResponse(teamResponse);
    }

    public TeamResponseController updateTeamById(TeamRequestController team, Integer id) {
        TeamRequestService teamUpdate = toTeamService(team);
        TeamResponseService teamResponse = facade.updateTeamById(teamUpdate, id);
        return toTeamControllerResponse(teamResponse);
    }

    public void deleteTeamById(Integer id) {
        facade.deleteTeamById(id);
    }

    public TeamResponseController findTeamById(Integer id) {
        TeamResponseService teamResponse = facade.findTeamById(id);
        return toTeamControllerResponse(teamResponse);
    }

    public List<TeamResponseController> findAllTeams() {
        return facade.findAllTeams().stream()
                .map(TeamControllerResponseMapper::toTeamControllerResponse)
                .toList();
    }

}
