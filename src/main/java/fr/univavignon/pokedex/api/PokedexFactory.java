package fr.univavignon.pokedex.api;

/**
 * PokedexFactory class implementing IPokedexFactory interface
 *
 * @author EYRAUD Grégory
 */
public class PokedexFactory implements IPokedexFactory{
    /**
     * PokedexFactory's default constructor
     */
    public PokedexFactory() {
    }
    /**
     * PokedexFactory's default constructor
     * @param metadataProvider Metadata provider the created pokedex will use.
     * @param pokemonFactory Pokemon factory the created pokedex will use.
     * @return a new Pokedex
     */
    @Override
    public IPokedex createPokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory) {
        return new Pokedex(metadataProvider, pokemonFactory);
    }

}
