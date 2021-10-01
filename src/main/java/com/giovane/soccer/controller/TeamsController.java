package com.giovane.soccer.controller;

import com.giovane.soccer.annotations.*;
import com.giovane.soccer.model.dto.TeamRequestDto;
import com.giovane.soccer.model.dto.TeamResponseDto;
import com.giovane.soccer.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/soccer")
public class TeamsController {

    private final TeamService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path = "/team", consumes = MediaType.APPLICATION_JSON_VALUE)
    @TeamSaveStandardsCodes
    public TeamResponseDto saveTeam(@RequestBody @Valid TeamRequestDto team) {
        return service.saveTeam(team);
    }


    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping(path = "/team/{id}")
    @TeamPutStandardCodes
    public TeamResponseDto updateTeam(@RequestBody @Valid TeamRequestDto team, @PathVariable("id") Integer id) {
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
    public List<TeamResponseDto> findAllTeams() {
        return service.findAllTeams();
    }


    @ResponseStatus(HttpStatus.OK)
    @GetMapping(path = "/team/{id}")
    @TeamGetStandardCodes
    public TeamResponseDto searchTeamById(@PathVariable("id") Integer id) {
        return service.findTeamById(id);
    }

}
