package com.giovane.soccer.contract.facade;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import com.giovane.soccer.mapper.response.TeamControllerResponseMapper;
import com.giovane.soccer.model.request.TeamRequestController;
import com.giovane.soccer.model.request.TeamRequestService;
import com.giovane.soccer.model.response.TeamResponseController;
import com.giovane.soccer.model.response.TeamResponseService;
import com.giovane.soccer.facade.TeamServiceFacade;
import static com.giovane.soccer.mapper.request.TeamControllerRequestMapper.toTeamService;
import static com.giovane.soccer.mapper.response.TeamControllerResponseMapper.toControllerResponse;

@AllArgsConstructor
@Component
public class TeamControllerImpl implements TeamControllerFacade {

    private final TeamServiceFacade facade;

    public TeamResponseController saveTeam(TeamRequestController team) {
        TeamRequestService teamSave = toTeamService(team);
        TeamResponseService teamResponse = facade.saveTeam(teamSave);
        return toControllerResponse(teamResponse);
    }

    public TeamResponseController updateTeamById(TeamRequestController team, Integer id) {
        TeamRequestService teamUpdate = toTeamService(team);
        TeamResponseService teamResponse = facade.updateTeamById(teamUpdate, id);
        return toControllerResponse(teamResponse);
    }

    public void deleteTeamById(Integer id) {
        facade.deleteTeamById(id);
    }

    public TeamResponseController findTeamById(Integer id) {
        TeamResponseService teamResponse = facade.findTeamById(id);
        return toControllerResponse(teamResponse);
    }

    public List<TeamResponseController> findAllTeams() {
        return facade.findAllTeams().stream()
                .map(TeamControllerResponseMapper::toControllerResponse)
                .toList();
    }

}
