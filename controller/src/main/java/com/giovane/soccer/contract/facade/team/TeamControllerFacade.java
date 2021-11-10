package com.giovane.soccer.contract.facade.team;

import com.giovane.soccer.model.team.request.TeamRequestController;
import com.giovane.soccer.model.team.response.TeamResponseController;

import java.util.List;

public interface TeamControllerFacade {

    TeamResponseController saveTeam(TeamRequestController team);

    TeamResponseController updateTeamById(TeamRequestController team, Integer id);

    void deleteTeamById(Integer id);

    TeamResponseController findTeamById(Integer id);

    List<TeamResponseController> findAllTeams();

}
