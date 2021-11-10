package com.giovane.soccer.contract.v1;

import com.giovane.soccer.contract.facade.league.LeagueControllerFacade;
import com.giovane.soccer.model.league.request.LeagueRequestController;
import com.giovane.soccer.model.league.response.LeagueResponseController;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import static org.springframework.http.HttpStatus.*;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/soccer/league")
public class LeagueController {

    private final LeagueControllerFacade facade;

    @ResponseStatus(CREATED)
    @PostMapping
    public LeagueResponseController saveLeague(@RequestBody @Valid LeagueRequestController league) {
       return facade.saveLeague(league);
    }

    @ResponseStatus(NO_CONTENT)
    @PutMapping(path = "/{id}")
    public LeagueResponseController updateLeagueById(@RequestBody @Valid LeagueRequestController league, @PathVariable("id") Integer id) {
        return facade.updateLeagueById(league, id);
    }

    @ResponseStatus(NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    public void deleteLeagueById(@PathVariable("id") Integer id) {
        facade.deleteLeagueById(id);
    }

    @ResponseStatus(OK)
    @GetMapping(path = "/{id}")
    public LeagueResponseController findLeagueById(@PathVariable("id") Integer id) {
        return facade.findLeagueById(id);
    }

    @ResponseStatus(OK)
    @GetMapping(path = "/findAll")
    public List<LeagueResponseController> findAllLeagues() {
        return facade.findAllLeagues();
    }

}
