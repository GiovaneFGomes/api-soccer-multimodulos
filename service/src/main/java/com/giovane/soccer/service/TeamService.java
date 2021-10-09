package com.giovane.soccer.service;

import com.giovane.soccer.dto.TeamDto;
import com.giovane.soccer.dto.TeamResponseDto;
import com.giovane.soccer.entity.Team;

import java.util.List;

public interface TeamService {

    TeamResponseDto saveTeam(Team id);

    TeamResponseDto updateTeamById(Team team, Integer id);

    void deleteTeamById(Integer id);

    TeamResponseDto findTeamById(Integer id);

    List<TeamResponseDto> findAllTeams();
}
