package com.giovane.soccer.config.swagger.annotations.constants;

import lombok.*;
import static lombok.AccessLevel.*;

@NoArgsConstructor(access = PRIVATE)
public class TeamConstantsParameterSwagger {

    public static final String TEAM_DESCRIPTION_PARAM =
            "The required body must be in JSON";

    public static final String TEAM_ID_DESCRIPTION_PARAM =
            "Teams can be fetched via the /api/v1/soccer/team/findAll";

    public static final String TEAM_FIND_BY_ID_DESCRIPTION_PARAM =
            "Teams can be saved via the /api/v1/soccer/team";

}
