package fr.univavignon.pokedex.api;

import fr.univavignon.pokedex.api.IPokedex;
import fr.univavignon.pokedex.api.PokedexException;
import fr.univavignon.pokedex.api.Pokemon;
import fr.univavignon.pokedex.api.PokemonMetadata;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pokedex implements IPokedex {

    private ArrayList<Pokemon> pokemons;

    public Pokedex() {
        pokemons = new ArrayList<>(150);
    }

    @Override
    public int size() {
        return pokemons.size();
    }

    @Override
    public int addPokemon(Pokemon pokemon) {
        //pokemons.set(pokemon.getIndex(), pokemon);
        pokemons.add(pokemon);
        return pokemon.getIndex();
    }

    @Override
    public Pokemon getPokemon(int id) throws PokedexException {
        try{
            return pokemons.get(id);
        } catch (Exception e) {
            throw new PokedexException(e.getMessage());
        }

    }

    @Override
    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
        ArrayList<Pokemon> list = pokemons;
        list.sort(order);
        return list;
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        PokemonMetadata metadata;
        try {
             metadata = getPokemonMetadata(index);
             } catch (PokedexException e) {
                throw new RuntimeException(e);
        }
        return new Pokemon(index, metadata.getName(), metadata.getAttack(), metadata.getDefense(), metadata.getStamina(), cp, hp, dust, candy, 53);
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        Pokemon pokemon = pokemons.get(index);
        return new PokemonMetadata(index, pokemon.getName(), pokemon.getAttack(), pokemon.getDefense(), pokemon.getStamina());
    }
}
