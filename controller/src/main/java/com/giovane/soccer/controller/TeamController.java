package com.giovane.soccer.controller;

import com.giovane.soccer.annotations.*;
import com.giovane.soccer.dto.*;
import lombok.AllArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.giovane.soccer.service.TeamService;
import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.*;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/soccer")
public class TeamController {

    private final TeamService service;

    @ResponseStatus(CREATED)
    @PostMapping(path = "/team", consumes = MediaType.APPLICATION_JSON_VALUE)
    @TeamSaveStandardsCodes
    public TeamResponse saveTeam(@RequestBody @Valid TeamRequest team) {
        return service.saveTeam(team);
    }

    @ResponseStatus(NO_CONTENT)
    @PutMapping(path = "/team/{id}")
    @TeamPutStandardCodes
    public TeamResponse updateTeamById(@RequestBody @Valid TeamRequest team, @PathVariable("id") Integer id) {
        return service.updateTeamById(team, id);
    }

    @ResponseStatus(NO_CONTENT)
    @DeleteMapping(path = "/team/{id}")
    @TeamDeleteStandardCodes
    public void deleteTeamById(@PathVariable("id") Integer id) {
        service.deleteTeamById(id);
    }

    @ResponseStatus(OK)
    @GetMapping(path = "/team/{id}")
    @TeamGetStandardCodes
    public TeamResponse findTeamById(@PathVariable("id") Integer id) {
        return service.findTeamById(id);
    }

//    @ResponseStatus(OK)
//    @GetMapping(path = "/teams")
//    @TeamGetAllStandardCodes
//    public List<TeamResponse> findAllTeams() {
//        return service.findAllTeams();
//    }

}
