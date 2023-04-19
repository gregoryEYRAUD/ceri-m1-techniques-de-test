package fr.univavignon.pokedex.api;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class IPokemonTrainerFactoryTest {
    /*
    /**
	 * Creates and returns a PokemonTrainer instance.
	 *
	 * @param name Name of the created trainer.
	 * @param team Team of the created trainer.
	 * @param pokedexFactory Factory to use for creating associated pokedex instance.
	 * @return Created trainer instance.
	 PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory);
     */

    @Test
    public void testCreateTrainer(){

        PokemonTrainerFactory pokemonTrainerFactory = new PokemonTrainerFactory();
        PokemonTrainer pokemonTrainer = pokemonTrainerFactory.createTrainer("Red", Team.INSTINCT, new PokedexFactory());

        assertNotNull(pokemonTrainer);
        assertEquals("Red", pokemonTrainer.getName());
        assertEquals(Team.INSTINCT, pokemonTrainer.getTeam());
        assertNotNull(pokemonTrainer.getPokedex());
    }
}
