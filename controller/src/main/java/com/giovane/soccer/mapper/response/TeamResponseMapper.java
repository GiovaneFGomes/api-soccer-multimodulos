package com.giovane.soccer.mapper.response;

import com.giovane.soccer.model.response.TeamResponseController;
import com.giovane.soccer.model.response.TeamResponseService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamResponseMapper {

    static TeamResponseController toControllerResponse(TeamResponseService teamResponseService) {
        return Mappers.getMapper(TeamResponseMapper.class)
                .mapperResponse(teamResponseService);
    }

    TeamResponseController mapperResponse(TeamResponseService teamResponse);

}
