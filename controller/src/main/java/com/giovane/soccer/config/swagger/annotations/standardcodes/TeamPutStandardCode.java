package com.giovane.soccer.config.swagger.annotations.standardcodes;

import java.lang.annotation.*;

import com.giovane.soccer.dto.TeamResponse;
import com.giovane.soccer.exceptions.details.ExceptionDetailsNotFound;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.*;
import org.springframework.http.MediaType;

import static java.lang.annotation.ElementType.*;
import static io.swagger.v3.oas.annotations.enums.ParameterIn.*;
import static com.giovane.soccer.config.swagger.annotations.constants.TeamConstantsOperationSwagger.*;
import static com.giovane.soccer.config.swagger.annotations.constants.TeamConstantsParameterSwagger.*;

@Target({ METHOD, ANNOTATION_TYPE, TYPE })
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Team has been updated"),
        @ApiResponse(responseCode = "400", description = "An incorrect request has been sent"),
        @ApiResponse(responseCode = "400", description = "Body did not respect the constraints"),
        @ApiResponse(responseCode = "400", description = "Body was blank"),
        @ApiResponse(responseCode = "404", description = "Team id does not exist",
                content = @Content(schema = @Schema(implementation = ExceptionDetailsNotFound.class), mediaType = MediaType.APPLICATION_JSON_VALUE)),
})
@Parameter(name = "id", example = "10", required = true,
        description = TEAM_DESCRIPTION_PARAM, in = PATH
)
@Operation(summary = TEAM_PUT_SUMMARY_OP, description = TEAM_PUT_DESCRIPTION_OP)
public @interface TeamPutStandardCode {

}
