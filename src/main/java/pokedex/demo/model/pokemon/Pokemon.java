package pokedex.demo.model.pokemon;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity(name = "Pokemon")
@Table(name = "pokemon")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "of")
public class Pokemon {
    @Id
    private  long dexnumber;
    private String nome;
    private float peso;
    private float altura;
    @ElementCollection
    List<AbilityWrapper> abilities;
    @ElementCollection
    List<TypeWrapper> types;
    @ElementCollection
    List<Moves> moves;

    public Pokemon(DadosPokemon dadosPokemon) {
        this.dexnumber = dadosPokemon.dexnumero();
        this.nome = dadosPokemon.nome();
        this.peso = dadosPokemon.peso();
        this.altura = dadosPokemon.altura();
        this.abilities = dadosPokemon.abilities();
        this.types  = dadosPokemon.types();
        this.moves = dadosPokemon.moves() ;
    }
}
