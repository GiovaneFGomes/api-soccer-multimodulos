package com.giovane.soccer.contract.v1;

import java.util.List;

import com.giovane.soccer.contract.facade.TeamControllerFacade;
import com.giovane.soccer.contract.facade.TeamControllerImpl;
import com.giovane.soccer.mapper.response.TeamResponseMapper;
import com.giovane.soccer.model.request.TeamRequestController;
import com.giovane.soccer.model.request.TeamRequestService;
import com.giovane.soccer.model.response.TeamResponseController;
import com.giovane.soccer.model.response.TeamResponseService;
import com.giovane.soccer.service.team.TeamServiceFacade;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import com.giovane.soccer.config.swagger.annotations.standardcodes.*;
import static org.springframework.http.HttpStatus.*;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/soccer/team")
public class TeamController {

    private final TeamControllerFacade facade;

    private final TeamServiceFacade teamService;

    @ResponseStatus(CREATED)
    @PostMapping
    @TeamSaveStandardsCode
    public TeamResponseController saveTeam(@RequestBody @Valid TeamRequestController team) {
       return facade.saveTeam(team);
    }

    @ResponseStatus(NO_CONTENT)
    @PutMapping(path = "/{id}")
    @TeamPutStandardCode
    public TeamResponseService updateTeamById(@RequestBody @Valid TeamRequestService team, @PathVariable("id") Integer id) {
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
    public TeamResponseService findTeamById(@PathVariable("id") Integer id) {
        return teamService.findTeamById(id);
    }

    @ResponseStatus(OK)
    @GetMapping(path = "/findAll")
    @TeamGetAllStandardCode
    public List<TeamResponseService> findAllTeams() {
        return teamService.findAllTeams();
    }

}
