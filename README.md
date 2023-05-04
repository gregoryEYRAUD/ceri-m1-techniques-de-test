# UCE Génie Logiciel Avancé : Techniques de tests

Nom : EYRAUD Grégory

Groupe : M1 IA CLA

Badge CLI: [![CircleCI](https://dl.circleci.com/status-badge/img/gh/gregoryEYRAUD/ceri-m1-techniques-de-test/tree/master.svg?style=svg)](https://dl.circleci.com/status-badge/redirect/gh/gregoryEYRAUD/ceri-m1-techniques-de-test/tree/master)

Badge Codecov : [![codecov](https://codecov.io/gh/gregoryEYRAUD/ceri-m1-techniques-de-test/branch/master/graph/badge.svg?token=JY9DXWVYVS)](https://codecov.io/gh/gregoryEYRAUD/ceri-m1-techniques-de-test)

Badge Checkstyle : ![Checkstyle](target/site/badges/checkstyle-result.svg)
# Implémentation des interfaces

Pour implémenter les différentes interfaces, j'ai procédé de la manière suivante:

- Pour la classe Pokedex, j'ai créer 3 attributs: la liste des pokémons, un objet PokemonMetadataProvider, et un objet PokemonFactory.
- Ensuite, j'ai créer un constructeur pour la classe Pokedex me permettant ainsi d'initialiser ses attribut en les passant ainsi lors de l'appel de la méthode createPokedex de la classe PokedexFactory.
- La classe PokemonFactory est utilisée par la classe Pokedex dans la méthode createPokemon() et me permet d'utiliser la méthode createPokemon() de l'objet de la classe PokemonFactory.
- Cette même logique est utilisé pour la classe PokemonMetadataProvider
- J'ai ajouté à ces 2 dernières classe une méthode setPokedex() qui me permet de mettre à jour leurs attribut de la classe Pokedex à chaque ajout de nouveau Pokemon dans ce dernier.
- La classe PokemonTrainerFactory est utilisé pour créer un objet de la classe PokemonTrainer.