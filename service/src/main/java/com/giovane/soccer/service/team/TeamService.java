package com.giovane.soccer.service.team;

import java.util.List;
import java.util.Optional;
import com.giovane.soccer.dto.TeamRequestDto;
import com.giovane.soccer.dto.TeamResponseDto;
import com.giovane.soccer.entity.team.Team;
import com.giovane.soccer.TeamRepository;
import com.giovane.soccer.exceptions.notfound.NotFoundException;
import com.giovane.soccer.mapper.TeamMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamResponseDto saveTeam(TeamRequestDto team) {
        Team team1 = TeamMapper.INSTANCE.toTeamEntity(team);
        Team teamSave = teamRepository.save(team1);
        return Optional.of(TeamMapper.INSTANCE.toTeamResponseDto(teamSave))
                .orElseThrow(() -> new NotFoundException("erf"));
    }
    // TODO arrumar exceptions ainda dos orElse

    public TeamResponseDto updateTeamById(TeamRequestDto team, Integer id){
        Team teamId = teamRepository.findById(id).orElseThrow(() -> new NotFoundException("ID not found"));
        team.setId(teamId.getId());
        Team team1 = TeamMapper.INSTANCE.toTeamEntity(team);
        teamRepository.save(team1);
        return Optional.of(TeamMapper.INSTANCE.toTeamResponseDto(team1))
                .orElseThrow(() -> new NotFoundException("wef"));
    }

    public void deleteTeamById(Integer id) {
        teamRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        teamRepository.deleteById(id);
    }

    public TeamResponseDto findTeamById(Integer id){
        Team teamId = teamRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        return TeamMapper.INSTANCE.toTeamResponseDto(teamId);
    }

    public List<TeamResponseDto> findAllTeams() {
        return Optional.of(teamRepository.findAll().stream()
                .map(TeamMapper.INSTANCE::toTeamResponseDto)
                        .toList())
                .orElseThrow(() -> new NotFoundException(""));
    }

}
