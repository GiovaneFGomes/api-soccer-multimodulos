package com.giovane.soccer.mapper.response;

import com.giovane.soccer.model.entity.Team;
import com.giovane.soccer.model.response.TeamResponseService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamServiceResponseMapper {

    static TeamResponseService toTeamServiceResponse(Team team){
        return Mappers.getMapper(TeamServiceResponseMapper.class)
                .mapper(team);
    }

    TeamResponseService mapper(Team team);

}
