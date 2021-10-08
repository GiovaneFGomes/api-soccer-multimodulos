package com.giovane.soccer.config.swagger.annotations.standardcodes;

import com.giovane.soccer.dto.TeamResponse;
import io.swagger.annotations.*;

import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;

import static com.giovane.soccer.config.swagger.annotations.constants.TeamConstantsParameterSwagger.TEAM_DESCRIPTION_PARAM;
import static java.lang.annotation.ElementType.*;
import static com.giovane.soccer.config.swagger.annotations.constants.TeamConstantsOperationSwagger.*;

@Target({ METHOD, ANNOTATION_TYPE, TYPE })
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses(value = {
        @ApiResponse(code = 201, message = "Team was created", response = TeamResponse.class),
        @ApiResponse(code = 400, message = "An incorrect request has been sent"),
        @ApiResponse(code = 400, message = "Body did not respect the constraints")
})
@ApiImplicitParams({
        @ApiImplicitParam(name = "team", required = true,  value = TEAM_DESCRIPTION_PARAM)
})
@ApiOperation(value = TEAM_SAVE_SUMMARY_OP, notes = TEAM_SAVE_DESCRIPTION_OP)
public @interface TeamSaveStandardsCode {

}
