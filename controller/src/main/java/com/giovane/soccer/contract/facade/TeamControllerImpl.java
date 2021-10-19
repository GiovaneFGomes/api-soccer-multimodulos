package com.giovane.soccer.contract.facade;

import com.giovane.soccer.mapper.request.TeamRequestMapper;
import com.giovane.soccer.model.request.TeamRequestController;
import com.giovane.soccer.model.request.TeamRequestService;
import com.giovane.soccer.model.response.TeamResponseController;
import com.giovane.soccer.service.team.TeamServiceFacade;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TeamControllerImpl implements TeamControllerFacade {

    private final TeamServiceFacade teamService;

    public TeamResponseController saveTeam(TeamRequestController team){
        TeamRequestService team1 = TeamRequestMapper.toTeamService(team);
        return teamService.saveTeam(team1);
    }

}
