package pokedex.demo.model.ability;

import jakarta.persistence.*;
import pokedex.demo.model.pokemon.Pokemon;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Ability")
public class Ability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long abilityid;

    @ElementCollection
    private List<EffectAbility> efeito;  // Lista de efeitos associados à habilidade

    // Relacionamento Many-to-Many com Pokemon
    @ManyToMany
    @JoinTable(
            name = "ability_pokemon",  // Tabela associativa
            joinColumns = @JoinColumn(name = "ability_id"),  // Chave estrangeira para Ability
            inverseJoinColumns = @JoinColumn(name = "dexnumber")  // Chave estrangeira para Pokemon
    )
    private Set<Pokemon> pokemons;  // Relacionamento com a entidade Pokemon

    public Ability(DadosAbility dadosAbility) {
        this.efeito = dadosAbility.efeitos();
        // Não usamos @ElementCollection para pokemon, mas sim @ManyToMany
        // O campo `pokemons` será preenchido no momento da relação
    }

    // Getters e Setters
    public long getAbilityid() {
        return abilityid;
    }

    public void setAbilityid(long abilityid) {
        this.abilityid = abilityid;
    }

    public List<EffectAbility> getEfeito() {
        return efeito;
    }

    public void setEfeito(List<EffectAbility> efeito) {
        this.efeito = efeito;
    }

    public Set<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(Set<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
