package com.giovane.soccer.dto;

import com.giovane.soccer.entity.team.Team;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class TeamResponsePatchDto extends Team {
    private Integer id;
    private String name;
    private String stadium;
    private String country;
}
