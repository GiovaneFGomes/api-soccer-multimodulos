package com.giovane.soccer.service.team;

import com.giovane.soccer.dto.TeamRequestDto;
import com.giovane.soccer.dto.TeamResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@AllArgsConstructor
@Component
public class TeamServiceImpl implements TeamServiceFacade {

    private final TeamService teamService;

    public TeamResponseDto saveTeam(TeamRequestDto team) {
        return teamService.saveTeam(team);
    }

    public void updateTeamById(TeamRequestDto team, Integer id) {
        teamService.updateTeamById(team, id);
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
