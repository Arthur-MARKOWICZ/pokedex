package pokedex.demo.model.pokemon;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
    @Embedded
    Ability abilities;
    @Embedded
    Type types;
    @Embedded
    Move moves;

    public Pokemon(DadosPokemon dadosPokemon) {
        this.dexnumber = dadosPokemon.dexnumero();
        this.nome = dadosPokemon.nome();
        this.peso = dadosPokemon.peso();
        this.altura = dadosPokemon.altura();
        this.abilities = new Ability(dadosPokemon.abilities());
        this.types  = new Type(dadosPokemon.types());
        this.moves = new Move(dadosPokemon.moves()) ;
    }
}
