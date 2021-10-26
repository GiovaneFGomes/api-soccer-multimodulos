package com.giovane.soccer.mapper.request;

import com.giovane.soccer.model.request.TeamRequestService;
import com.giovane.soccer.model.entity.Team;
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
