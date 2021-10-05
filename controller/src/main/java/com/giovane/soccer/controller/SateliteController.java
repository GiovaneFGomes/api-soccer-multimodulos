package com.giovane.soccer.controller;

import com.giovane.soccer.service.SateliteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/v1/satelite")
public class SateliteController {

    private SateliteService service;

    @ResponseStatus(OK)
    @GetMapping
    public String findSatelite() {
        service.findSatelite();
        return "";
    }

}
