package com.giovane.soccer.model.league.response;

import com.giovane.soccer.model.entity.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LeagueResponseController {
    private Integer id;
    private String name;
    List<Team> team;
}
