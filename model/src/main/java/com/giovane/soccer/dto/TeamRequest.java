package com.giovane.soccer.dto;

import com.giovane.soccer.entity.Team;
import javax.validation.constraints.*;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TeamRequest {

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

    public TeamRequest(Team teams) {
        this.id = teams.getId();
        this.name = teams.getName();
        this.stadium = teams.getStadium();
        this.country = teams.getCountry();
    }

    public Team createTeam(TeamRequest team){
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
