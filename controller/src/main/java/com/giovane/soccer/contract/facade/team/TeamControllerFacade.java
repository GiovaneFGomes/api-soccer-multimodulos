package com.giovane.soccer.contract.facade.team;

import com.giovane.soccer.model.team.request.TeamRequestController;
import com.giovane.soccer.model.team.response.TeamResponseController;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class TeamControllerFacade {

    private final TeamController controller;

    public TeamResponseController saveTeam(TeamRequestController team) {
        return controller.saveTeam(team);
    }

    public TeamResponseController updateTeamById(TeamRequestController team, Integer id) {
        return controller.updateTeamById(team, id);
    }

    public void deleteTeamById(Integer id) {
        controller.deleteTeamById(id);
    }

    public TeamResponseController findTeamById(Integer id) {
        return controller.findTeamById(id);
    }

    public List<TeamResponseController> findAllTeams() {
        return controller.findAllTeams();
    }

}
