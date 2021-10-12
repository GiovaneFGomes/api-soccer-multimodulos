package com.giovane.soccer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LeaguesClient {
    public int league_id;
    public int country_id;
    public String name;
}
