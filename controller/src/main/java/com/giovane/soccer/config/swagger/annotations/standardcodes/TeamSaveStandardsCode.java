package com.giovane.soccer.config.swagger.annotations.standardcodes;

import java.lang.annotation.*;

import com.giovane.soccer.model.response.TeamResponseService;
import io.swagger.annotations.*;
import java.lang.annotation.RetentionPolicy;
import static java.lang.annotation.ElementType.*;
import static com.giovane.soccer.config.swagger.annotations.constants.TeamConstantsParameterSwagger.*;
import static com.giovane.soccer.config.swagger.annotations.constants.TeamConstantsOperationSwagger.*;

@Target({ METHOD, ANNOTATION_TYPE, TYPE })
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses(value = {
        @ApiResponse(code = 201, message = "Team was created", response = TeamResponseService.class),
        @ApiResponse(code = 400, message = "Body or request did not respect the constraints"),
})
@ApiImplicitParams({
        @ApiImplicitParam(name = "team", required = true,  value = TEAM_DESCRIPTION_PARAM)
})
@ApiOperation(value = TEAM_SAVE_SUMMARY_OP, notes = TEAM_SAVE_DESCRIPTION_OP)
public @interface TeamSaveStandardsCode {

}
