package com.giovane.soccer.contract.mapper.request;

import com.giovane.soccer.contract.model.request.TeamRequestController;
import com.giovane.soccer.service.model.team.request.TeamRequestService;
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
