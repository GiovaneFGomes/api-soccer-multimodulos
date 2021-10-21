package com.giovane.soccer.mapper.request;

import com.giovane.soccer.model.request.TeamRequestController;
import com.giovane.soccer.model.request.TeamRequestService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TeamControllerRequestMapper {

    static TeamRequestService toTeamService(TeamRequestController teamRequest){
        return Mappers.getMapper(TeamControllerRequestMapper.class)
                .mapper(teamRequest);
    }

    TeamRequestService mapper(TeamRequestController team);

}
