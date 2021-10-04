package com.giovane.soccer.service;

import com.giovane.soccer.exceptions.notfound.NotFoundException;
import com.giovane.soccer.mapper.TeamMapper;
import com.giovane.soccer.model.Team;
import com.giovane.soccer.model.dto.TeamRequestDto;
import com.giovane.soccer.model.dto.TeamResponseDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TeamService {

    private final TeamMapper mapper;

    public TeamResponseDto saveTeam(TeamRequestDto team) {
        Team team1 = team.createTeam(team);
        Long linhas = mapper.insert(team1);
        if(linhas >= 1){
            return new TeamResponseDto(team1);
        }else{
            throw new NotFoundException("wfewrf");
        }
    }

    public TeamResponseDto updateTeamById(TeamRequestDto team, Integer id){
        TeamResponseDto id_not_found = mapper.findById(id).orElseThrow(() -> new NotFoundException("ID not found"));
        team.setId(id_not_found.getId());
        id_not_found.setName(team.getName());
        id_not_found.setStadium(team.getStadium());
        id_not_found.setCountry(team.getCountry());
        Long linhas = mapper.update(id_not_found);
        System.out.println(linhas);
        return new TeamResponseDto(id_not_found);
    }

    public void deleteTeamById(Integer id) {
        mapper.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        mapper.deleteById(id);
    }

    public TeamResponseDto findTeamById(Integer id){
        Team team = mapper.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        return new TeamResponseDto(team);
    }

    public List<TeamResponseDto> findAllTeams(){
        return mapper.findAll();
    }

}
