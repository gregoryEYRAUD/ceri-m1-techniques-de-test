package fr.univavignon.pokedex.api;

import fr.univavignon.pokedex.api.IPokemonMetadataProvider;
import fr.univavignon.pokedex.api.PokedexException;
import fr.univavignon.pokedex.api.PokemonMetadata;

/**
 * PokemonMetadataProvider class implementing IPokemonMetadataProvider interface
 */
public class PokemonMetadataProvider implements IPokemonMetadataProvider {
    private Pokedex pokedex;

    /**
     * PokemonMetadataProvider's default constructor
     */
    public PokemonMetadataProvider() {
    }

    /**
     * PokemonMetadataProvider's default constructor
     * @param index Index of the pokemon to retrieve metadata for.
     * @return Pokemon's PokemonMetadata for the given <strong>id</strong>
     * @throws PokedexException If the given <strong>index</strong> is not valid.
     */
    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        Pokemon pokemon = pokedex.getPokemon(index);
        return new PokemonMetadata(index, pokemon.getName(), pokemon.getAttack(), pokemon.getDefense(), pokemon.getStamina());
    }

    /**
     * setter for the pokedex
     * @param pokedex the updated pokedex
     */
    public void setPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
    }
}