package com.giovane.soccer.mapper.league.response;

import com.giovane.soccer.model.league.response.LeagueResponseController;
import com.giovane.soccer.model.league.response.LeagueResponseService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LeagueControllerResponseMapper {
    static LeagueResponseController toLeagueControllerResponse(LeagueResponseService leagueResponseService) {
        return Mappers.getMapper(LeagueControllerResponseMapper.class)
                .mapper(leagueResponseService);
    }

    LeagueResponseController mapper(LeagueResponseService teamResponse);
}
