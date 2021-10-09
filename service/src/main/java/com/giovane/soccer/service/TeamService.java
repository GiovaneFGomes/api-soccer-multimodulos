package com.giovane.soccer.service;

import com.giovane.soccer.dto.TeamRequestDto;
import com.giovane.soccer.dto.TeamResponseDto;
import java.util.List;

public interface TeamService {

    TeamResponseDto saveTeam(TeamRequestDto id);

    TeamResponseDto updateTeamById(TeamRequestDto team, Integer id);

    void deleteTeamById(Integer id);

    TeamResponseDto findTeamById(Integer id);

    List<TeamResponseDto> findAllTeams();

}
