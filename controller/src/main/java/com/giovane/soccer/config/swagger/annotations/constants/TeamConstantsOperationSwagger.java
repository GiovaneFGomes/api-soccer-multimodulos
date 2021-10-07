package com.giovane.soccer.config.swagger.annotations.constants;

import lombok.*;
import static lombok.AccessLevel.*;

@NoArgsConstructor(access = PRIVATE)
public class TeamConstantsOperationSwagger {

    public static final String TEAM_SAVE_SUMMARY_OP = "This endpoint save a football team";
    public static final String TEAM_SAVE_DESCRIPTION_OP = "This method save a football team";

    public static final String TEAM_PUT_SUMMARY_OP = "This endpoint updates a football team";
    public static final String TEAM_PUT_DESCRIPTION_OP = "This method updates a football team";

    public static final String TEAM_DELETE_BY_ID_SUMMARY_OP = "This endpoint deletes a football team";
    public static final String TEAM_DELETE_BY_ID_DESCRIPTION_OP = "This method deletes the football team";

    public static final String TEAM_FIND_ALL_SUMMARY_OP = "This endpoint find all teams";
    public static final String TEAM_FIND_ALL_DESCRIPTION_OP = "This method finds all teams in the database";

    public static final String TEAM_FIND_SUMMARY_OP = "This endpoint find a single team";
    public static final String TEAM_FIND_DESCRIPTION_OP = "This method find a single team in the database";

}
