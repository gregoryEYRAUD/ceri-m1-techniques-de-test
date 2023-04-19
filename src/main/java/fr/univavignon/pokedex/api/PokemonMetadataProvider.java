package fr.univavignon.pokedex.api;

import fr.univavignon.pokedex.api.IPokemonMetadataProvider;
import fr.univavignon.pokedex.api.PokedexException;
import fr.univavignon.pokedex.api.PokemonMetadata;

public class PokemonMetadataProvider implements IPokemonMetadataProvider {
    private Pokedex pokedex;

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        Pokemon pokemon = pokedex.getPokemon(index);
        return new PokemonMetadata(index, pokemon.getName(), pokemon.getAttack(), pokemon.getDefense(), pokemon.getStamina());
    }

    public void setPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
    }
}