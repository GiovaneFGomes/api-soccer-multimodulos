package com.giovane.soccer.config.swagger.annotations.standardcodes;

import java.lang.annotation.*;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.responses.*;
import static java.lang.annotation.ElementType.*;
import static com.giovane.soccer.config.swagger.annotations.constants.TeamConstantsOperationSwagger.*;

@Target({ METHOD, ANNOTATION_TYPE, TYPE })
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Found all football teams"),
})
@Operation(summary = TEAM_FIND_ALL_SUMMARY_OP, description = TEAM_FIND_ALL_DESCRIPTION_OP)
public @interface TeamGetAllStandardCode {

}
