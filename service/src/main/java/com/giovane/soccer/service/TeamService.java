package com.giovane.soccer.service;

import com.giovane.soccer.TeamRepository;
import com.giovane.soccer.dto.TeamRequest;
import com.giovane.soccer.dto.TeamResponse;
import com.giovane.soccer.entity.Team;
import com.giovane.soccer.exceptions.notfound.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamResponse saveTeam(TeamRequest team) {
        Team team1 = team.createTeam(team);
        Team team2 = teamRepository.save(team1);
        return new TeamResponse(team2);
    }

    public TeamResponse updateTeamById(TeamRequest team, Integer id){
      teamRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
      Team team1 = team.createTeam(team);
      Team team2 = teamRepository.save(team1);
      return new TeamResponse(team2);
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

//    public List<TeamResponse> findAllTeams(){
//       teamRepository.findAll();
//    }

}
