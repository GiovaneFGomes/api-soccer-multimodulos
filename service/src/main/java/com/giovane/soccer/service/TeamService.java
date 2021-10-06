package com.giovane.soccer.service;

import com.giovane.soccer.TeamRepository;
import com.giovane.soccer.dto.TeamRequest;
import com.giovane.soccer.dto.TeamResponse;
import com.giovane.soccer.entity.Team;
import com.giovane.soccer.exceptions.notfound.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamResponse saveTeam(TeamRequest team) {
        Team team1 = team.createTeam(team);
        Team team2 = teamRepository.save(team1);
        return new TeamResponse(team2);
    }

    public void updateTeamById(TeamRequest team, Integer id){
        Team teamId = teamRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        Team team1 = team.createTeam(team);
        team1.setId(teamId.getId());
        teamRepository.save(team1);
    }

    public void deleteTeamById(Integer id) {
        teamRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        teamRepository.deleteById(id);
    }

    public TeamResponse findTeamById(Integer id){
        Team team = teamRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        return new TeamResponse(team);
    }

    public List<TeamResponse> findAllTeams() {
        return teamRepository.findAll().stream().map(e -> {
            TeamResponse dto = new TeamResponse();
            dto.setId(e.getId());
            dto.setName(e.getName());
            dto.setCountry(e.getCountry());
            dto.setStadium(e.getStadium());
            return dto;
        }).collect(Collectors.toList());
    }

}
