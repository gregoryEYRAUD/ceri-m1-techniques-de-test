package fr.univavignon.pokedex.api;

/**
 * Factory interface for class that aims to create IPokedex instance.
 * @author fv
 */
public interface IPokedexFactory {
    /**
     * Creates a new pokedex instance using the given
     * metadataProvider and >pokemonFactory.
     * @param provider Metadata provider the created pokedex'll use.
     * @param factory Pokemon factory the created pokedex'll use.
     * @return Created pokedex instance.
     */
    IPokedex createPokedex(IPokemonMetadataProvider provider,
						   IPokemonFactory factory);
}
