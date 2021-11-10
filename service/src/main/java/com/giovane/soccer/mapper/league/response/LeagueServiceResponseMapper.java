package com.giovane.soccer.mapper.league.response;

import com.giovane.soccer.model.entity.League;
import com.giovane.soccer.model.league.response.LeagueResponseService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LeagueServiceResponseMapper {

    static LeagueResponseService toLeagueServiceResponse(League league){
        return Mappers.getMapper(LeagueServiceResponseMapper.class)
                .mapper(league);
    }

    LeagueResponseService mapper(League league);

}
