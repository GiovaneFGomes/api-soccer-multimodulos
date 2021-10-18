package com.giovane.soccer.mapper;

import com.giovane.soccer.model.dto.TeamRequestDto;
import com.giovane.soccer.model.dto.TeamResponseDto;
import com.giovane.soccer.model.entity.Team;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TeamMapper {

    TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);

    TeamResponseDto toTeamResponseDto(Team team);

    Team toTeamEntity(TeamRequestDto team);

}
