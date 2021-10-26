package com.giovane.soccer.facade;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.giovane.soccer.mapper.response.TeamServiceResponseMapper;
import com.giovane.soccer.model.entity.Team;
import com.giovane.soccer.model.request.TeamRequestService;
import com.giovane.soccer.model.response.TeamResponseService;
import com.giovane.soccer.repository.TeamRepository;
import com.giovane.soccer.exceptions.notfound.NotFoundException;
import static com.giovane.soccer.mapper.request.TeamServiceRequestMapper.toTeamEntity;
import static com.giovane.soccer.mapper.response.TeamServiceResponseMapper.toTeamServiceResponse;

@AllArgsConstructor
@Service
public class TeamServiceImpl implements TeamServiceFacade{

    private final TeamRepository repository;

    public TeamResponseService saveTeam(TeamRequestService team) {
        Team teamSave = toTeamEntity(team);
        Team teamResponse = repository.save(teamSave);
        return toTeamServiceResponse(teamResponse);
    }

    public TeamResponseService updateTeamById(TeamRequestService team, Integer id){
        Team teamId = repository
                .findById(id).orElseThrow(() -> new NotFoundException("ID not found"));
        team.setId(teamId.getId());
        Team teamSave = toTeamEntity(team);
        Team teamResponse = repository.save(teamSave);
        return toTeamServiceResponse(teamResponse);
    }

    public void deleteTeamById(Integer id) {
        repository.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
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
