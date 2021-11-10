package com.giovane.soccer.mapper.team.request;

import com.giovane.soccer.model.entity.Team;
import com.giovane.soccer.model.team.request.TeamRequestService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamServiceRequestMapper {

    static Team toTeamEntity(TeamRequestService teamRequest){
        return Mappers.getMapper(TeamServiceRequestMapper.class)
                .mapper(teamRequest);
    }

    Team mapper(TeamRequestService team);

}
