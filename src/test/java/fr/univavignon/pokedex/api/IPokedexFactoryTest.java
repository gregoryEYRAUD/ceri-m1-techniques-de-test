package fr.univavignon.pokedex.api;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class IPokedexFactoryTest {

    /*
    /**
	 * Creates a new pokedex instance using the given
	 * <tt>metadataProvider</tt> and <tt>pokemonFactory</tt>.
	 *
	 * @param metadataProvider Metadata provider the created pokedex will use.
	 * @param pokemonFactory Pokemon factory the created pokedex will use.
	 * @return Created pokedex instance.

    IPokedex createPokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory);

     */

    @Test
    public void testCreatePokedex(){
        /*IPokedex mockedPokedex = Mockito.mock(IPokedex.class);

        IPokemonMetadataProvider mockedProvider = Mockito.mock(IPokemonMetadataProvider.class);
        IPokemonFactory mockedFactory = Mockito.mock(IPokemonFactory.class);
        IPokedexFactory mockedPokedexFactory = Mockito.mock(IPokedexFactory.class);

        Mockito.when(mockedPokedexFactory.createPokedex(mockedProvider, mockedFactory)).thenReturn(mockedPokedex);

        IPokedex test = mockedPokedexFactory.createPokedex(mockedProvider, mockedFactory);

        assertEquals(test, mockedPokedex);*/

        PokedexFactory pokedexFactory = new PokedexFactory();
        PokemonMetadataProvider pokemonMetadataProvider = new PokemonMetadataProvider();
        PokemonFactory pokemonFactory = new PokemonFactory();

        Pokedex pokedex = (Pokedex) pokedexFactory.createPokedex(pokemonMetadataProvider, pokemonFactory);

        assertNotNull(pokedex);

    }

}
