package com.giovane.soccer.contract.model.request;

import com.giovane.soccer.entity.team.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LeagueRequestController {

    private Integer id;

    @NotBlank
    @Size(min = 3, max = 40, message = "Min 3 and Max 100 characters.")
    private String name;

    List<Team> team;

    public void setName(String name) {
        this.name = name.strip();
    }

}
