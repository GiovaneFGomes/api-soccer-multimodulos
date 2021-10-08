package com.giovane.soccer.exceptions.details;

import lombok.*;
import java.time.Instant;
import lombok.experimental.SuperBuilder;
import io.swagger.annotations.ApiModelProperty;

@SuperBuilder
@Data
public class ExceptionDetailsBadRequest {

    @ApiModelProperty(example = "400")
    private Integer status;

    @ApiModelProperty(example = "Bad Request")
    private String title;

    @ApiModelProperty(example = "2021-10-08T18:53:38.592137070Z")
    private Instant timestamp;

    @ApiModelProperty(example = "You sent a request that this server didn't understand")
    private String details;

    @ApiModelProperty(example = "Check the request")
    private String developerMessage;

}
