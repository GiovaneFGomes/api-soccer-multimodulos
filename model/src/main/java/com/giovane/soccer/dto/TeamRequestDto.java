package com.giovane.soccer.dto;

import lombok.*;
import javax.validation.constraints.*;
import com.giovane.soccer.entity.team.Team;
import io.swagger.annotations.ApiModelProperty;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TeamRequestDto {

    @ApiModelProperty(hidden = true)
    private Integer id;

    @NotBlank
    @Size(min = 3, max = 40, message = "Min 3 and Max 40 characters.")
    @ApiModelProperty(example = "Real Madrid")
    private String name;

    @NotBlank
    @Size(min = 3, max = 50, message = "Min 3 and Max 40 characters.")
    @ApiModelProperty(example = "Santiago Bernabéu")
    private String stadium;

    @NotBlank
    @Size(min = 3, max = 50, message = "Min 3 and Max 40 characters.")
    @ApiModelProperty(example = "Spain")
    private String country;

    public TeamRequestDto(Team teams) {
        this.id = teams.getId();
        this.name = teams.getName();
        this.stadium = teams.getStadium();
        this.country = teams.getCountry();
    }

    public Team createTeam(TeamRequestDto team){
        return Team.builder()
                .name(team.getName())
                .stadium(team.getStadium())
                .country(team.getCountry())
                .build();
    }

    public void setName(String name) {
        this.name = name.strip();
    }

    public void setStadium(String stadium) {
        this.stadium = stadium.strip();
    }

    public void setCountry(String country) {
        this.country = country.strip();
    }

}
