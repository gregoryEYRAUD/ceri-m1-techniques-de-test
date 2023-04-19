package fr.univavignon.pokedex.api;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class IPokemonFactoryTest {
    /*@Test
    /**
     * Creates a pokemon instance computing it IVs.
     *
     * @param index Pokemon index.
     * @param cp Pokemon CP.
     * @param hp Pokemon HP.
     * @param dust Required dust for upgrading pokemon.
     * @param candy Required candy for upgrading pokemon.
     * @return Created pokemon instance.
     */
    /*Pokemon createPokemon(int index, int cp, int hp, int dust, int candy){
        IPokedex mockedPokedex = Mockito.mock(IPokedex.class);
        IPokemonMetadataProviderTest test = new IPokemonMetadataProviderTest();
        try {
            PokemonMetadata metadata = test.getPokemonMetadata(index);
            return new Pokemon(index, metadata.getName(), metadata.getAttack(), metadata.getDefense(), metadata.getStamina(), cp, hp, dust, candy, 50.0);
        } catch (PokedexException e) {
            throw new RuntimeException(e);
        }
    }*/

    /*
    Index 	0 	133
Nom 	Bulbizarre 	Aquali
Attaque 	126 	186
Défense 	126 	168
Endurance 	90 	260
CP 	613 	2729
HP 	64 	202
Dust 	4000 	5000
Candy 	4 	4
IV 	56% 	100%
     */

    @Test
    public void testCreerPokemon(){
        Pokemon bulbizarre = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
        Pokemon aquali = new Pokemon(133, "Aquali", 186, 168, 260, 2729, 202, 5000, 4 , 100);
        IPokemonFactory mockedFactory = Mockito.mock(IPokemonFactory.class);

        Mockito.when(mockedFactory.createPokemon(0, 613, 64, 4000, 4)).thenReturn(bulbizarre);

        Pokemon poke = mockedFactory.createPokemon(0, 613, 64, 4000, 4);

        //assertEquals(poke, bulbizarre);
    }
}
