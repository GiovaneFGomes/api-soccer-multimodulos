package com.giovane.soccer.mapper.league.request;

import com.giovane.soccer.model.entity.League;
import com.giovane.soccer.model.league.request.LeagueRequestService;
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
