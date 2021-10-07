package com.giovane.soccer.config.swagger.annotations.standardcodes;

import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.responses.*;
import static java.lang.annotation.ElementType.*;
import static com.giovane.soccer.config.swagger.annotations.constants.TeamConstantsOperationSwagger.*;

@Target({ METHOD, ANNOTATION_TYPE, TYPE })
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Team was created"),
        @ApiResponse(responseCode = "400", description = "An incorrect request has been sent"),
        @ApiResponse(responseCode = "400", description = "Body did not respect the constraints"),
        @ApiResponse(responseCode = "400", description = "Body was blank")
})
@Operation(summary = TEAM_SAVE_SUMMARY_OP, description = TEAM_SAVE_DESCRIPTION_OP)
public @interface TeamSaveStandardsCode {

}
