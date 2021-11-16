package com.giovane.soccer.facade.team;

import com.giovane.soccer.exceptions.notfound.NotFoundException;
import com.giovane.soccer.mapper.team.response.TeamServiceResponseMapper;
import com.giovane.soccer.model.entity.Team;
import com.giovane.soccer.model.team.request.TeamRequestService;
import com.giovane.soccer.model.team.response.TeamResponseService;
import com.giovane.soccer.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import static com.giovane.soccer.mapper.team.request.TeamServiceRequestMapper.toTeamEntity;
import static com.giovane.soccer.mapper.team.response.TeamServiceResponseMapper.toTeamServiceResponse;

@AllArgsConstructor
@Service
public class TeamService {

    private final TeamRepository repository;

    public TeamResponseService saveTeam(TeamRequestService team) {
        Team teamSave = toTeamEntity(team);
        Team teamResponse = repository.save(teamSave);
        return toTeamServiceResponse(teamResponse);
    }

    public TeamResponseService updateTeamById(TeamRequestService team, Integer id) {
        team.setId(id);
        Team teamSave = toTeamEntity(team);
        Team teamResponse = repository.save(teamSave);
        return toTeamServiceResponse(teamResponse);
    }

    public void deleteTeamById(Integer id) {
        repository.deleteById(id);
    }

    public TeamResponseService findTeamById(Integer id){
        Team teamResponse = repository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        return toTeamServiceResponse(teamResponse);
    }

    public List<TeamResponseService> findAllTeams() {
        return repository.findAll().stream()
                .map(TeamServiceResponseMapper::toTeamServiceResponse)
                .toList();
    }

}
