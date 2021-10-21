package com.giovane.soccer.mapper.request;

import com.giovane.soccer.model.request.TeamRequestService;
import com.giovane.soccer.model.entity.TeamEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamServiceRequestMapper {

    static TeamEntity toTeamEntity(TeamRequestService teamRequest){
        return Mappers.getMapper(TeamServiceRequestMapper.class)
                .mapper(teamRequest);
    }

    TeamEntity mapper(TeamRequestService team);

}
