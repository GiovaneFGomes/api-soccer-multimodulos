package com.giovane.soccer.contract.v1;

import java.util.List;
import com.giovane.soccer.dto.*;
import com.giovane.soccer.service.TeamService;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import com.giovane.soccer.config.swagger.annotations.standardcodes.*;
import static org.springframework.http.HttpStatus.*;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/soccer/team")
public class TeamController {

    private final TeamService teamService;

    @ResponseStatus(CREATED)
    @PostMapping
    @TeamSaveStandardsCode
    public TeamResponseDto saveTeam(@RequestBody @Valid TeamRequestDto team) {
        return teamService.saveTeam(team);
    }

    @ResponseStatus(NO_CONTENT)
    @PutMapping(path = "/{id}")
    @TeamPutStandardCode
    public TeamResponseDto updateTeamById(@RequestBody @Valid TeamRequestDto team, @PathVariable("id") Integer id) {
       return teamService.updateTeamById(team, id);
    }

    @ResponseStatus(NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    @TeamDeleteIdStandardCode
    public void deleteTeamById(@PathVariable("id") Integer id) {
        teamService.deleteTeamById(id);
    }

    @ResponseStatus(OK)
    @GetMapping(path = "/{id}")
    @TeamGetIdStandardCode
    public TeamResponseDto findTeamById(@PathVariable("id") Integer id) {
        return teamService.findTeamById(id);
    }

    @ResponseStatus(OK)
    @GetMapping(path = "/findAll")
    @TeamGetAllStandardCode
    public List<TeamResponseDto> findAllTeams() {
        return teamService.findAllTeams();
    }

}
