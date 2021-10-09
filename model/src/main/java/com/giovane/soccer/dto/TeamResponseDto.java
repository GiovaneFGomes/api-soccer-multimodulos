package com.giovane.soccer.dto;

import lombok.*;
import com.giovane.soccer.entity.team.Team;
import lombok.experimental.SuperBuilder;
import io.swagger.annotations.ApiModelProperty;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class TeamResponseDto extends Team {

    @ApiModelProperty(example = "1")
    private Integer id;

    @ApiModelProperty(example = "Real Madrid")
    private String name;

    @ApiModelProperty(example = "Santiago Bernabéu")
    private String stadium;

    @ApiModelProperty(example = "Spain")
    private String country;

    public TeamResponseDto(Team team) {
        this.id = team.getId();
        this.name = team.getName();
        this.stadium = team.getStadium();
        this.country = team.getCountry();
    }


}
