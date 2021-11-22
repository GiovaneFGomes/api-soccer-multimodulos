package com.giovane.soccer.contract.mapper.response;

import com.giovane.soccer.contract.model.response.LeagueResponseController;
import com.giovane.soccer.service.model.league.response.LeagueResponseService;
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
