package com.giovane.soccer.facade.team;

import com.giovane.soccer.model.team.request.TeamRequestService;
import com.giovane.soccer.model.team.response.TeamResponseService;

import java.util.List;

public interface TeamServiceFacade {

    TeamResponseService saveTeam(TeamRequestService team);

    TeamResponseService updateTeamById(TeamRequestService team, Integer id);

    void deleteTeamById(Integer id);

    TeamResponseService findTeamById(Integer id);

    List<TeamResponseService> findAllTeams();

}
