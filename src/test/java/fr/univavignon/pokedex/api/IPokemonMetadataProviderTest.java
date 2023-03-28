package fr.univavignon.pokedex.api;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class IPokemonMetadataProviderTest {
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
    public void testGetPokemonMetadata() throws PokedexException{
        IPokedex mockedPokedex = Mockito.mock(IPokedex.class);
        Pokemon bulbizarre = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
        Pokemon aquali = new Pokemon(133, "Aquali", 186, 168, 260, 2729, 202, 5000, 4 , 100);

        Mockito.when(mockedPokedex.getPokemon(0)).thenReturn(bulbizarre);
        PokemonMetadata metadata = new PokemonMetadata(0, "Bulbizarre", 126, 126, 90);
        IPokemonMetadataProvider metadataProvider = Mockito.mock(IPokemonMetadataProvider.class);

        Mockito.when(metadataProvider.getPokemonMetadata(0)).thenReturn(metadata);

        PokemonMetadata metadataTest = metadataProvider.getPokemonMetadata(0);

        assertEquals(metadataTest, metadata);
    }
}
