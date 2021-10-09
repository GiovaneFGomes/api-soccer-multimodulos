package com.giovane.soccer.mapper;

import com.giovane.soccer.dto.TeamRequestDto;
import com.giovane.soccer.dto.TeamRequestPatchDto;
import com.giovane.soccer.dto.TeamResponseDto;
import com.giovane.soccer.dto.TeamResponsePatchDto;
import com.giovane.soccer.entity.team.Team;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TeamMapper {

    TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);

    TeamResponseDto toTeamResponseDto(Team team);
    Team toTeamEntity(TeamRequestDto team);

    Team toTeamEntity2(TeamRequestPatchDto team);
    TeamResponsePatchDto toTeamResponsePatchDto(Team team);

}
