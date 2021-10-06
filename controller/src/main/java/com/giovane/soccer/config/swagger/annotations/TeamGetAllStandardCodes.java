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
        @ApiResponse(responseCode = "200", description = "Shows all football teams"),
})
@Operation(summary = TeamConstantsSwagger.TEAM_FIND_ALL_SUMMARY, description = TeamConstantsSwagger.TEAM_FIND_ALL_DESCRIPTION)
public @interface TeamGetAllStandardCodes {

}
