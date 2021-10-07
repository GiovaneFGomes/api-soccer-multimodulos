package com.giovane.soccer.exceptions.details;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.time.Instant;

@SuperBuilder
@Data
public class ExceptionDetailsNotFound {
    @Schema(example = "404")
    private Integer status;
    @Schema(example = "Not found")
    private String title;
    @Schema(example = "2021-10-07T19:10:00.993Z")
    private Instant timestamp;
    @Schema(example = "ID not found")
    private String details;
    @Schema(example = "Include a valid ID. Make sure it exists.")
    private String developerMessage;
}
