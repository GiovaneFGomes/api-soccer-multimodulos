package com.giovane.soccer.controller;

import com.giovane.soccer.model.League;
import com.giovane.soccer.service.LeagueService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.http.HttpStatus.OK;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1")
public class LeagueController {

    private final LeagueService service;

    @ResponseStatus(OK)
    @GetMapping("/league")
    public League findLeague() {
        return service.findLeagues();
    }
}
