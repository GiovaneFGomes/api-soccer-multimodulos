package com.giovane.soccer.config.swagger.annotations.standardcodes;

import java.lang.annotation.*;

import com.giovane.soccer.model.team.response.TeamResponseService;
import io.swagger.annotations.*;
import static java.lang.annotation.ElementType.*;
import static com.giovane.soccer.config.swagger.annotations.constants.TeamConstantsOperationSwagger.*;

@Target({ METHOD, ANNOTATION_TYPE, TYPE })
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses(value = {
        @ApiResponse(code =  200, message = "Found all football teams", response = TeamResponseService.class)
})
@ApiOperation(value = TEAM_FIND_ALL_SUMMARY_OP, notes = TEAM_FIND_ALL_DESCRIPTION_OP)
public @interface TeamGetAllStandardCode {

}
