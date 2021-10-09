package com.giovane.soccer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TeamRequestPatchDto {
        private Integer id;
        private String name;
        private String stadium;
        private String country;
}
