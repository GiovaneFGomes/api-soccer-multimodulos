package com.giovane.soccer.contract.mapper.request;

import com.giovane.soccer.contract.model.request.LeagueRequestController;
import com.giovane.soccer.service.model.league.request.LeagueRequestService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LeagueControllerRequestMapper {

    static LeagueRequestService toLeagueService(LeagueRequestController leagueRequest){
        return Mappers.getMapper(LeagueControllerRequestMapper.class)
                .mapper(leagueRequest);
    }

    LeagueRequestService mapper(LeagueRequestController team);

}



