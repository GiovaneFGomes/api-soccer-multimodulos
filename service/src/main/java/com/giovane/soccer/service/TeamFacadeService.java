package com.giovane.soccer.service;

import com.giovane.soccer.dto.TeamRequestDto;
import com.giovane.soccer.dto.TeamResponseDto;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class TeamFacadeService implements TeamService{

    private final TeamService teamService;

    public TeamResponseDto saveTeam(TeamRequestDto team) {
        return teamService.saveTeam(team);
    }

    public TeamResponseDto updateTeamById(TeamRequestDto team, Integer id) {
        return teamService.updateTeamById(team, id);
    }

    public void deleteTeamById(Integer id) {
        teamService.deleteTeamById(id);
    }

    public TeamResponseDto findTeamById(Integer id) {
        return teamService.findTeamById(id);
    }

    public List<TeamResponseDto> findAllTeams() {
        return teamService.findAllTeams();
    }

}
