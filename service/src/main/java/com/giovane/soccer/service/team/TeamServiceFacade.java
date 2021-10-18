package com.giovane.soccer.service.team;

import com.giovane.soccer.model.dto.TeamRequestDto;
import com.giovane.soccer.model.dto.TeamResponseDto;

import java.util.List;

public interface TeamServiceFacade {

    TeamResponseDto saveTeam(TeamRequestDto id);

    TeamResponseDto updateTeamById(TeamRequestDto team, Integer id);

    void deleteTeamById(Integer id);

    TeamResponseDto findTeamById(Integer id);

    List<TeamResponseDto> findAllTeams();

}
