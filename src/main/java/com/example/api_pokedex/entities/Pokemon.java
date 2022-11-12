package com.example.api_pokedex.entities;

import com.example.api_pokedex.entities.pivots.PokemonsSkill;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table (name = "pokemons")
@Getter @Setter
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true)
    @NotBlank
    private String name;

    @NotBlank
    private String species;

    @NotBlank
    private String type;

    @NotBlank
    private String image;

    @OneToOne(mappedBy = "pokemon")
    private Pokeball pokeball;

    @OneToMany(mappedBy = "pokemon")
    private List<PokemonsSkill> pokemonsSkills;
}
