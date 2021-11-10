package com.giovane.soccer.model.league.response;

import com.giovane.soccer.model.entity.Team;
import lombok.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LeagueResponseService {
    private Integer id;
    private String name;
    List<Team> team;
}
