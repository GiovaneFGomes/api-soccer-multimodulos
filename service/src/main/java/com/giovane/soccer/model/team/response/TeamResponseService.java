package com.giovane.soccer.model.team.response;

import com.giovane.soccer.model.entity.League;
import lombok.*;
import lombok.experimental.*;
import io.swagger.annotations.*;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class TeamResponseService {

    @ApiModelProperty(example = "1")
    private Integer id;

    @ApiModelProperty(example = "Real Madrid")
    private String name;

    @ApiModelProperty(example = "Santiago Bernabéu")
    private String stadium;

    @ApiModelProperty(example = "Spain")
    private String country;

    private League league;

}
