package com.giovane.soccer.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;
import io.swagger.annotations.ApiModelProperty;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
public class TeamResponseDto {

    @ApiModelProperty(example = "1")
    private Integer id;

    @ApiModelProperty(example = "Real Madrid")
    private String name;

    @ApiModelProperty(example = "Santiago Bernabéu")
    private String stadium;

    @ApiModelProperty(example = "Spain")
    private String country;

}
