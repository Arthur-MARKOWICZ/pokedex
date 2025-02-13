package pokedex.demo.model.pokemon;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pokedex.demo.model.ability.Ability;
import pokedex.demo.model.moves.Moves;

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
    @ManyToMany
    @JoinTable(
            name = "pokemon_ability",
            joinColumns = @JoinColumn(name = "dexnumber"),
            inverseJoinColumns = @JoinColumn(name = "abilityId")
    )
    private List<Ability> abilities;


    @ElementCollection
    @CollectionTable(name = "pokemon_types", joinColumns = @JoinColumn(name = "dexnumber"))
    List<TypeWrapper> types;

    @ManyToMany
    @JoinTable(
            name = "pokemon_moves",
            joinColumns = @JoinColumn(name = "dexnumber"),
            inverseJoinColumns = @JoinColumn(name = "idMove")
    )
    private List<Moves> moves;

    public Pokemon(DadosPokemon dadosPokemon) {
        this.dexnumber = dadosPokemon.dexnumero();
        this.nome = dadosPokemon.nome();
        this.peso = dadosPokemon.peso();
        this.altura = dadosPokemon.altura();

        this.types  = dadosPokemon.types();
    }
}
