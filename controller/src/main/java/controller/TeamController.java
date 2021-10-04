package controller;

import annotations.*;
import dto.TeamRequest;
import dto.TeamResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import service.TeamService;
import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/soccer")
public class TeamController {

    private final TeamService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/team", consumes = MediaType.APPLICATION_JSON_VALUE)
    @TeamSaveStandardsCodes
    public TeamResponse saveTeam(@RequestBody @Valid TeamRequest team) {
        return service.saveTeam(team);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping(path = "/team/{id}")
    @TeamPutStandardCodes
    public TeamResponse updateTeam(@RequestBody @Valid TeamRequest team, @PathVariable("id") Integer id) {
        return service.updateTeamById(team, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/team/{id}")
    @TeamDeleteStandardCodes
    public void deleteTeam(@PathVariable("id") Integer id) {
        service.deleteTeamById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/teams")
    @TeamGetAllStandardCodes
    public List<TeamResponse> findAllTeams() {
        return service.findAllTeams();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/team/{id}")
    @TeamGetStandardCodes
    public TeamResponse searchTeamById(@PathVariable("id") Integer id) {
        return service.findTeamById(id);
    }

}
