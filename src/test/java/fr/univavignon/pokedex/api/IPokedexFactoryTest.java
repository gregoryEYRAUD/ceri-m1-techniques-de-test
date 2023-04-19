package fr.univavignon.pokedex.api;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class IPokedexFactoryTest {

    @Test
    public void testCreatePokedex(){
        PokedexFactory pokedexFactory = new PokedexFactory();
        PokemonMetadataProvider pokemonMetadataProvider = new PokemonMetadataProvider();
        PokemonFactory pokemonFactory = new PokemonFactory();

        Pokedex pokedex = (Pokedex) pokedexFactory.createPokedex(pokemonMetadataProvider, pokemonFactory);

        assertNotNull(pokedex);

    }

}
