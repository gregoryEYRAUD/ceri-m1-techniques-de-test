package fr.univavignon.pokedex.api;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
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
        //Team mockedTeam = Mockito.mock(Team.class);
        Team team = Team.INSTINCT;
        IPokedexFactory mockedFactory = Mockito.mock(IPokedexFactory.class);
        String name = "Red";
        IPokemonTrainerFactory mockedTrainerFactory = Mockito.mock(IPokemonTrainerFactory.class);

        PokemonTrainer mockedTrainer = Mockito.mock(PokemonTrainer.class);

        Mockito.when(mockedTrainerFactory.createTrainer(name, team, mockedFactory)).thenReturn(mockedTrainer);
        PokemonTrainer trainer = mockedTrainerFactory.createTrainer(name, team, mockedFactory);

        Mockito.when(mockedTrainer.getName()).thenReturn(name);

        assertEquals("Red", trainer.getName());
        //assertEquals(Team.INSTINCT, trainer.getTeam());


        //assertEquals(trainer, mockedTrainer);

    }
}
