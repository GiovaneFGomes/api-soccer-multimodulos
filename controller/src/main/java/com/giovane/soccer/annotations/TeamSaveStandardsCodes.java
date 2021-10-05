package com.giovane.soccer.annotations;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.*;
import static java.lang.annotation.ElementType.*;
import static com.giovane.soccer.annotations.TeamConstantsSwagger.*;

@Target({ METHOD, ANNOTATION_TYPE, TYPE})
@Retention(RUNTIME)
@ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Team was created"),
        @ApiResponse(responseCode = "400", description = "An incorrect request has been sent"),
        @ApiResponse(responseCode = "400", description = "Body does not respect minimum or maximum character constraint"),
        @ApiResponse(responseCode = "400", description = "Body is blank"),
})
@Operation(summary = TEAM_SAVE_SUMMARY, description = TEAM_SAVE_DESCRIPTION)
public @interface TeamSaveStandardsCodes {

}
