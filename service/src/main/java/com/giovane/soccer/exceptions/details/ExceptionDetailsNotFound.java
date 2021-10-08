package com.giovane.soccer.exceptions.details;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.Instant;

@SuperBuilder
@Data
public class ExceptionDetailsNotFound {
    @ApiModelProperty(example = "404")
    private Integer status;
    @ApiModelProperty(example = "Not found")
    private String title;
    @ApiModelProperty(example = "2021-10-07T19:10:00.993Z")
    private Instant timestamp;
    @ApiModelProperty(example = "ID not found")
    private String details;
    @ApiModelProperty(example = "Include a valid ID. Make sure it exists.")
    private String developerMessage;
}
