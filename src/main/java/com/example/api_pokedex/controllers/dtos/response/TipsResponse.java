package com.example.api_pokedex.controllers.dtos.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipsResponse {
    private Long id;

    private String description;

    private String image;
}
