package com.giovane.soccer.service.mapper.league.request;

import com.giovane.soccer.entity.league.League;
import com.giovane.soccer.service.model.league.request.LeagueRequestService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LeagueServiceRequestMapper {

    static League toLeagueEntity(LeagueRequestService leagueRequest){
        return Mappers.getMapper(LeagueServiceRequestMapper.class)
                .mapper(leagueRequest);
    }

    League mapper(LeagueRequestService league);

}
