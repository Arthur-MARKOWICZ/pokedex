package pokedex.demo.principal;

import pokedex.demo.model.DadosPokemon;
import pokedex.demo.service.ConsumoApi;
import pokedex.demo.service.ConverteDados;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class principal {
    private ConsumoApi consumoApi = new ConsumoApi();
    private Scanner leitura = new Scanner(System.in);
    private String endereco ="https://pokeapi.co/api/v2/pokemon/";
    private ConverteDados conversor = new ConverteDados();
    public void exibeMenu(){
        var opcao =-1;
        while (opcao != 0){
            var menu = """
                    1- buscar pokemon
                    
                    0- sair
              
                    """;
            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();
            switch (opcao){
                case 0:
                    break;
                case 1:
                    buscarPokemon();
                    break;
            }
        }
    }

    private void buscarPokemon() {
        System.out.println("digite o nome do pokemon");
        var nomepokemon = leitura.nextLine();
        var json = consumoApi.obterDados(endereco + nomepokemon);
        DadosPokemon dadosPokemon = conversor.obterDados(json, DadosPokemon.class);
        System.out.println(dadosPokemon);
    }
}
