package com.giovane.soccer.mapper.response;

import com.giovane.soccer.model.entity.TeamEntity;
import com.giovane.soccer.model.response.TeamResponseService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamResponseMapper {

    static TeamResponseService toTeamServiceResponse(TeamEntity team){
        return Mappers.getMapper(TeamResponseMapper.class)
                .mapperResponse(team);
    }

    TeamResponseService mapperResponse(TeamEntity team);

}
