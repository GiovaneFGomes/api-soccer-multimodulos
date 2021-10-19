package com.giovane.soccer.mapper.response;

import com.giovane.soccer.model.request.TeamRequestController;
import com.giovane.soccer.model.response.TeamResponseService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamResponseMapper {

    static TeamResponseService toTeamResponseService(TeamRequestController teamRequest){
        return Mappers.getMapper(TeamResponseMapper.class)
                .mapperResponse(teamRequest);
    }

    TeamResponseService mapperResponse(TeamRequestController teamRequest);

}
