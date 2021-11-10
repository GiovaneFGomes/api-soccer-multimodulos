package com.giovane.soccer.mapper.team.response;

import com.giovane.soccer.model.team.response.TeamResponseController;
import com.giovane.soccer.model.team.response.TeamResponseService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamControllerResponseMapper {

    static TeamResponseController toTeamControllerResponse(TeamResponseService teamResponseService) {
        return Mappers.getMapper(TeamControllerResponseMapper.class)
                .mapper(teamResponseService);
    }

    TeamResponseController mapper(TeamResponseService teamResponse);

}