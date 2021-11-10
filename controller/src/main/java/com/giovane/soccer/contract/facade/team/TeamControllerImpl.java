package com.giovane.soccer.contract.facade.team;

import java.util.List;
import com.giovane.soccer.facade.team.TeamServiceFacade;
import com.giovane.soccer.mapper.team.response.TeamControllerResponseMapper;
import com.giovane.soccer.model.team.request.TeamRequestController;
import com.giovane.soccer.model.team.request.TeamRequestService;
import com.giovane.soccer.model.team.response.TeamResponseController;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import com.giovane.soccer.model.team.response.TeamResponseService;
import static com.giovane.soccer.mapper.team.request.TeamControllerRequestMapper.toTeamService;
import static com.giovane.soccer.mapper.team.response.TeamControllerResponseMapper.toTeamControllerResponse;

@AllArgsConstructor
@Component
public class TeamControllerImpl implements TeamControllerFacade {

    private final TeamServiceFacade facade;

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
