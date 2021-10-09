package com.giovane.soccer.service.team;

import com.giovane.soccer.dto.TeamRequestDto;
import com.giovane.soccer.dto.TeamRequestPatchDto;
import com.giovane.soccer.dto.TeamResponseDto;
import com.giovane.soccer.dto.TeamResponsePatchDto;

import java.util.List;

public interface TeamServiceFacade {

    TeamResponseDto saveTeam(TeamRequestDto id);

    void updateTeamById(TeamRequestDto team, Integer id);

    TeamResponsePatchDto patchTeamById(TeamRequestPatchDto team, Integer id);

    void deleteTeamById(Integer id);

    TeamResponseDto findTeamById(Integer id);

    List<TeamResponseDto> findAllTeams();

}
