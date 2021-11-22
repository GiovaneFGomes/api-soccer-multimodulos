package com.giovane.soccer.service.mapper.league.response;

import com.giovane.soccer.entity.league.League;
import com.giovane.soccer.service.model.league.response.LeagueResponseService;
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
