package com.giovane.soccer.mapper.response;

import com.giovane.soccer.model.response.TeamResponseController;
import com.giovane.soccer.model.response.TeamResponseService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamControllerResponseMapper {

    static TeamResponseController toControllerResponse(TeamResponseService teamResponseService) {
        return Mappers.getMapper(TeamControllerResponseMapper.class)
                .mapper(teamResponseService);
    }

    TeamResponseController mapper(TeamResponseService teamResponse);

}
