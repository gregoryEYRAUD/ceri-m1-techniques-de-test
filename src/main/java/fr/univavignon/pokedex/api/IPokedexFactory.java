package fr.univavignon.pokedex.api;

/**
 * Factory interface for class that aims to create IPokedex instance.
 * @author fv
 */
public interface IPokedexFactory {

    /**
	 * Creates a new pokedex instance using the given 
	 * <strong>metadataProvider</strong> and <strong>pokemonFactory</strong>.
	 * @param metadataProvider Metadata provider the created pokedex'll use.
	 * @param pokemonFactory Pokemon factory the created pokedex'll use.
	 * @return Created pokedex instance.
	 */
	IPokedex createPokedex(IPokemonMetadataProvider metadataProvider,
						   IPokemonFactory pokemonFactory);
}
