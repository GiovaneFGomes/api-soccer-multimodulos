package com.giovane.soccer.mapper.league.request;

import com.giovane.soccer.model.league.request.LeagueRequestController;
import com.giovane.soccer.model.league.request.LeagueRequestService;
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



