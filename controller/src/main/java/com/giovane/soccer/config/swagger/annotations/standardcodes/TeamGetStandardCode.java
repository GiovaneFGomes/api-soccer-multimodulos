package com.giovane.soccer.config.swagger.annotations.standardcodes;

import java.lang.annotation.*;

import com.giovane.soccer.dto.TeamResponse;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.*;
import org.springframework.http.MediaType;

import static java.lang.annotation.ElementType.*;
import static io.swagger.v3.oas.annotations.enums.ParameterIn.*;
import static com.giovane.soccer.config.swagger.annotations.constants.TeamConstantsParameterSwagger.*;
import static com.giovane.soccer.config.swagger.annotations.constants.TeamConstantsOperationSwagger.*;

@Target({ METHOD, ANNOTATION_TYPE, TYPE })
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Found a single football team",
                content = @Content(schema = @Schema(implementation = TeamResponse.class), mediaType = MediaType.APPLICATION_JSON_VALUE)),
        @ApiResponse(responseCode = "400", description = "An incorrect request has been sent",
                content = @Content(schema = @Schema(hidden = true))),
        @ApiResponse(responseCode = "404", description = "Team id does not exist",
                content = @Content(schema = @Schema(hidden = true)))
})
@Parameter(name = "id", example = "10", required = true,
        description = TEAM_FIND_BY_ID_DESCRIPTION_PARAM, in = PATH
)
@Operation(summary = TEAM_FIND_SUMMARY_OP, description = TEAM_FIND_DESCRIPTION_OP)
public @interface TeamGetStandardCode {

}
