package com.giovane.soccer.contract.v1;

import com.giovane.soccer.config.swagger.annotations.*;
import com.giovane.soccer.dto.*;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.giovane.soccer.service.TeamService;
import javax.validation.Valid;
import java.util.List;
import static org.springframework.http.HttpStatus.*;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/soccer/team")
public class TeamController {

    private final TeamService service;

    @ResponseStatus(CREATED)
    @PostMapping
    @TeamSaveStandardsCodes
    public TeamResponse saveTeam(@RequestBody @Valid TeamRequest team) {
        return service.saveTeam(team);
    }

    @ResponseStatus(NO_CONTENT)
    @PutMapping(path = "/{id}")
    @TeamPutStandardCodes
    public void updateTeamById(@RequestBody @Valid TeamRequest team, @PathVariable("id") Integer id) {
        service.updateTeamById(team, id);
    }

    @ResponseStatus(NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    @TeamDeleteStandardCodes
    public void deleteTeamById(@PathVariable("id") Integer id) {
        service.deleteTeamById(id);
    }

    @ResponseStatus(OK)
    @GetMapping(path = "/{id}")
    @TeamGetStandardCodes
    public TeamResponse findTeamById(@PathVariable("id") Integer id) {
        return service.findTeamById(id);
    }

    @ResponseStatus(OK)
    @GetMapping(path = "/findAll")
    @TeamGetAllStandardCodes
    public List<TeamResponse> findAllTeams() {
        return service.findAllTeams();
    }

}
