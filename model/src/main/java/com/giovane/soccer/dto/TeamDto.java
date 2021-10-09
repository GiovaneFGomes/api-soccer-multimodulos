package com.giovane.soccer.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class TeamDto {

    @ApiModelProperty(hidden = true)
    private Integer id;

    @NotBlank
    @Size(min = 3, max = 40, message = "Min 3 and Max 40 characters.")
    @ApiModelProperty(example = "Real Madrid")
    private String name;

    @NotBlank
    @Size(min = 3, max = 50, message = "Min 3 and Max 40 characters.")
    @ApiModelProperty(example = "Santiago Bernabéu")
    private String stadium;

    @NotBlank
    @Size(min = 3, max = 50, message = "Min 3 and Max 40 characters.")
    @ApiModelProperty(example = "Spain")
    private String country;

}
