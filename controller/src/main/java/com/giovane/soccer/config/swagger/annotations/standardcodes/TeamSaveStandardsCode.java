package com.giovane.soccer.config.swagger.annotations.standardcodes;

import java.lang.annotation.*;

import com.giovane.soccer.exceptions.details.ExceptionDetailsBadRequest;
import io.swagger.annotations.*;
import com.giovane.soccer.dto.TeamResponseDto;
import java.lang.annotation.RetentionPolicy;
import static java.lang.annotation.ElementType.*;
import static com.giovane.soccer.config.swagger.annotations.constants.TeamConstantsParameterSwagger.*;
import static com.giovane.soccer.config.swagger.annotations.constants.TeamConstantsOperationSwagger.*;

@Target({ METHOD, ANNOTATION_TYPE, TYPE })
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses(value = {
        @ApiResponse(code = 201, message = "Team was created", response = TeamResponseDto.class),
        @ApiResponse(code = 400, message = "An incorrect request has been sent", response = ExceptionDetailsBadRequest.class),
//      @ApiResponse(code = 400, message = "Body did not respect the constraints"),
        @ApiResponse(code = 400, message = "Body should have a minimum of 3 and a maximum of 40 or 50 characters"),
        @ApiResponse(code = 400, message = "Body was blank"),
})
@ApiImplicitParams({
        @ApiImplicitParam(name = "team", required = true,  value = TEAM_DESCRIPTION_PARAM)
})
@ApiOperation(value = TEAM_SAVE_SUMMARY_OP, notes = TEAM_SAVE_DESCRIPTION_OP)
public @interface TeamSaveStandardsCode {

}
