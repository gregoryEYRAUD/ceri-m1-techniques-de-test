package fr.univavignon.pokedex.api;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class IPokedexTest {
    /*
    int addPokemon(Pokemon pokemon);
    Pokemon getPokemon(int id) throws PokedexException;
    List<Pokemon> getPokemons();
    List<Pokemon> getPokemons(Comparator<Pokemon> order);
     */
    @Test
    public void testSize(){
        /*IPokedex pokedex = Mockito.mock(IPokedex.class);

        Mockito.when(pokedex.size()).thenReturn(0);

        int taille = pokedex.size();

        assertEquals(taille, 0);

        try {
            Mockito.when(pokedex.getPokemon(-1)).thenThrow(new PokedexException("ID incorrect"));
        } catch (PokedexException e) {
            assertEquals(e.getMessage(), "ID incorrect");
            throw new RuntimeException(e);
        }*/

        Pokedex pokedex = new Pokedex(new PokemonMetadataProvider(), new PokemonFactory());
        int taille = pokedex.size();
        assertEquals(0, taille);
    }


    @Test
    public void testAddPokemon(){
        /*Pokemon bulbizarre = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
        Pokemon aquali = new Pokemon(133, "Aquali", 186, 168, 260, 2729, 202, 5000, 4 , 100);

        IPokedex mockedPokedex = Mockito.mock(IPokedex.class);

        Mockito.when(mockedPokedex.addPokemon(bulbizarre)).thenReturn(0);
        Mockito.when(mockedPokedex.addPokemon(aquali)).thenReturn(133);

        int id1 = mockedPokedex.addPokemon(bulbizarre);
        int id2 = mockedPokedex.addPokemon(aquali);

        assertEquals(id1 , 0);
        assertEquals(id2 , 133);*/

        Pokemon bulbizarre = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
        Pokemon aquali = new Pokemon(133, "Aquali", 186, 168, 260, 2729, 202, 5000, 4 , 100);

        Pokedex pokedex = new Pokedex(new PokemonMetadataProvider(), new PokemonFactory());

        int id1 = pokedex.addPokemon(bulbizarre);
        int id2 = pokedex.addPokemon(aquali);

        assertEquals(id1 , 0);
        assertEquals(id2 , 133);

    }
    @Test
    public void testGetPokemon(){
        Pokemon bulbizarre = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
        Pokemon aquali = new Pokemon(133, "Aquali", 186, 168, 260, 2729, 202, 5000, 4 , 100);

        Pokedex pokedex = new Pokedex(new PokemonMetadataProvider(), new PokemonFactory());
        pokedex.addPokemon(bulbizarre);
        pokedex.addPokemon(aquali);

        try {
            Pokemon poke1 = pokedex.getPokemon(0);
            Pokemon poke2 = pokedex.getPokemon(133);

            assertEquals(poke1, bulbizarre);
            assertEquals(poke2, aquali);
        } catch (PokedexException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testGetPokemonException(){
        Pokedex pokedex = new Pokedex(new PokemonMetadataProvider(), new PokemonFactory());
        try {
            pokedex.getPokemon(0);
            fail("L'exception n'as pas été lancée");
        } catch (PokedexException e) {
            //L'exception à bien été lancée
        }
    }

    @Test
    public void testGetPokemons(){
        Pokemon bulbizarre = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
        Pokemon aquali = new Pokemon(133, "Aquali", 186, 168, 260, 2729, 202, 5000, 4 , 100);

        Pokedex pokedex = new Pokedex(new PokemonMetadataProvider(), new PokemonFactory());

        pokedex.addPokemon(bulbizarre);
        pokedex.addPokemon(aquali);

        List<Pokemon> list = new ArrayList<>();
        list.add(bulbizarre);
        list.add(aquali);

        List<Pokemon> pokedexList = pokedex.getPokemons();

        assertEquals(pokedexList, list);
    }

    @Test
    public void testGetPokemonsSorted(){
        Pokemon bulbizarre = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);
        Pokemon aquali = new Pokemon(133, "Aquali", 186, 168, 260, 2729, 202, 5000, 4 , 100);

        Pokedex pokedex = new Pokedex(new PokemonMetadataProvider(), new PokemonFactory());

        pokedex.addPokemon(bulbizarre);
        pokedex.addPokemon(aquali);

        List<Pokemon> list = new ArrayList<>();
        list.add(aquali);
        list.add(bulbizarre);

        PokemonComparators order = PokemonComparators.NAME;

        list.sort(order);

        List<Pokemon> pokemonList = pokedex.getPokemons(PokemonComparators.NAME);

        assertEquals(list, pokemonList);
    }
    @Test
    public void testCreatePokemon(){
        Pokemon bulbizarre = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);

        Pokedex pokedex = new Pokedex(new PokemonMetadataProvider(), new PokemonFactory());
        pokedex.addPokemon(bulbizarre);

        Pokemon pokemon = null;
        try {
            pokemon = pokedex.createPokemon(0, 613, 64, 4000, 4);
        } catch (PokedexException e) {
            throw new RuntimeException(e);
        }

        assertNotNull(pokemon);
    }

    @Test
    public void testCreatePokemonException(){
        Pokedex pokedex = new Pokedex(new PokemonMetadataProvider(), new PokemonFactory());
        try {
            pokedex.createPokemon(0, 613, 64, 4000, 4);
            fail("L'exception ne s'est pas lancée");
        } catch (PokedexException e) {
            //throw new RuntimeException(e);
        }
    }

    @Test
    public void testGetPokemonMetadata(){
        Pokemon bulbizarre = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56);

        Pokedex pokedex = new Pokedex(new PokemonMetadataProvider(), new PokemonFactory());
        pokedex.addPokemon(bulbizarre);
        PokemonMetadata metadata;
        try {
            metadata = pokedex.getPokemonMetadata(0);
        } catch (PokedexException e) {
            throw new RuntimeException(e);
        }

        assertNotNull(metadata);
    }

    @Test
    public void testGetPokemonMetadataException(){
        Pokedex pokedex = new Pokedex(new PokemonMetadataProvider(), new PokemonFactory());

        PokemonMetadata metadata;
        try {
            metadata = pokedex.getPokemonMetadata(0);
            fail("L'exception ne s'est pas lancée");
        } catch (PokedexException e) {
            //throw new RuntimeException(e);
        }
    }
}
