package fr.univavignon.pokedex.api;

public class PokemonFactory implements IPokemonFactory{

    private Pokedex pokedex;

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
        PokemonMetadata metadata;
        try {
            metadata = pokedex.getPokemonMetadata(index);
        } catch (PokedexException e) {
            throw new RuntimeException(e);
        }
        return new Pokemon(index, metadata.getName(), metadata.getAttack(), metadata.getDefense(), metadata.getStamina(), cp, hp, dust, candy, 56);
    }

    public void setPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
    }
}
