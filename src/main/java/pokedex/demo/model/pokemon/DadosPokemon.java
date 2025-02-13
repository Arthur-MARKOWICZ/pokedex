package pokedex.demo.model.pokemon;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosPokemon(
        @JsonAlias("id") long dexnumero,
        @JsonAlias("name") String nome,
        @JsonAlias("weight")float peso,
        @JsonAlias("height")float altura,
        List<TypeWrapper> types
) {}

