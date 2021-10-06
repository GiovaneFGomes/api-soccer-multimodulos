package com.giovane.soccer.config.swagger.annotations;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.*;
import static java.lang.annotation.ElementType.*;

@Target({ METHOD, ANNOTATION_TYPE, TYPE })
@Retention(RUNTIME)
@ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Team has been updated"),
        @ApiResponse(responseCode = "400", description = "An incorrect request has been sent"),
        @ApiResponse(responseCode = "400", description = "Body does not respect minimum or maximum character constraint"),
        @ApiResponse(responseCode = "400", description = "Body is blank"),
        @ApiResponse(responseCode = "404", description = "Team's ID does not exist"),
})
@Operation(summary = TeamConstantsSwagger.TEAM_PUT_SUMMARY, description = TeamConstantsSwagger.TEAM_PUT_DESCRIPTION)
public @interface TeamPutStandardCodes {

}
