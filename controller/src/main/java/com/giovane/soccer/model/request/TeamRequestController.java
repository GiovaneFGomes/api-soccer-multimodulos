package com.giovane.soccer.model.request;

import lombok.*;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TeamRequestController {

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
