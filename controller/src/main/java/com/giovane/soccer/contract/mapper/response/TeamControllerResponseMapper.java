package com.giovane.soccer.contract.mapper.response;

import com.giovane.soccer.contract.model.response.TeamResponseController;
import com.giovane.soccer.service.model.team.response.TeamResponseService;
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