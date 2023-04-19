package fr.univavignon.pokedex.api;

public class PokemonFactory implements IPokemonFactory{

    private Pokedex pokedex;

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) throws PokedexException {
        PokemonMetadata metadata;
        metadata = pokedex.getPokemonMetadata(index);
        return new Pokemon(index, metadata.getName(), metadata.getAttack(), metadata.getDefense(), metadata.getStamina(), cp, hp, dust, candy, 56);
    }

    public void setPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
    }
}
