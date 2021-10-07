package com.giovane.soccer.config.swagger.annotations.standardcodes;

import java.lang.annotation.*;

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
        @ApiResponse(responseCode =  "200", description = "Found all football teams",
                content = @Content(schema = @Schema(implementation = TeamResponse.class), mediaType = MediaType.APPLICATION_JSON_VALUE)),
})
@Operation(summary = TEAM_FIND_ALL_SUMMARY_OP, description = TEAM_FIND_ALL_DESCRIPTION_OP)
public @interface TeamGetAllStandardCode {

}
