package com.example.api_pokedex.controllers.dtos.request;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UpdateSkillRequest {
    private String name;

    private String effect;

    private String type;
}
