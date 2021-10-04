package service;

import badrequest.BadRequestException;
import dto.TeamRequest;
import dto.TeamResponse;
import entity.Team;
import lombok.AllArgsConstructor;
import mapper.TeamMapper;
import notfound.NotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;

@AllArgsConstructor
@Service
public class TeamService {

    private final TeamMapper mapper;

    public TeamResponse saveTeam(TeamRequest team) {
        Team team1 = team.createTeam(team);
        Long lines = mapper.insert(team1);
        if(lines >= 1) {
            return new TeamResponse(team1);
        }else {
            throw new BadRequestException("You sent a request that this server didn't understand");
        }
    }

    public TeamResponse updateTeamById(TeamRequest team, Integer id){
        TeamResponse id_not_found = mapper.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        team.setId(id_not_found.getId());
        id_not_found.setName(team.getName());
        id_not_found.setStadium(team.getStadium());
        id_not_found.setCountry(team.getCountry());
        Long lines = mapper.update(id_not_found);
        System.out.println(lines);
        return new TeamResponse(id_not_found);
    }

    public void deleteTeamById(Integer id) {
        mapper.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        mapper.deleteById(id);
    }

    public TeamResponse findTeamById(Integer id){
        Team team = mapper.findById(id)
                .orElseThrow(() -> new NotFoundException("ID not found"));
        return new TeamResponse(team);
    }

    public List<TeamResponse> findAllTeams(){
        return mapper.findAll();
    }

}
