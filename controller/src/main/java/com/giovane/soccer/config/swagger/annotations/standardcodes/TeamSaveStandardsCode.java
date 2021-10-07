package com.giovane.soccer.config.swagger.annotations.standardcodes;

import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;

import com.giovane.soccer.dto.TeamResponse;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.*;
import org.springframework.http.MediaType;

import static java.lang.annotation.ElementType.*;
import static com.giovane.soccer.config.swagger.annotations.constants.TeamConstantsOperationSwagger.*;

@Target({ METHOD, ANNOTATION_TYPE, TYPE })
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Team was created",
                content = @Content(schema = @Schema(implementation = TeamResponse.class), mediaType = MediaType.APPLICATION_JSON_VALUE)),
        @ApiResponse(responseCode = "400", description = "An incorrect request has been sent", content = @Content(mediaType = "application/json")),
        @ApiResponse(responseCode = "400", description = "Body did not respect the constraints", content = @Content(mediaType = "application/json")),
})
@Operation(summary = TEAM_SAVE_SUMMARY_OP, description = TEAM_SAVE_DESCRIPTION_OP)
public @interface TeamSaveStandardsCode {

}
