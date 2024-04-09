package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokedexTest {

    @Mock
    private IPokedex pokedex;

    @Before
    public void setUp() {
        ;
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testSizeWithEmptyPokedex() {
        // Définir le comportement du mock pokedex pour retourner une taille de 0
        when(pokedex.size()).thenReturn(0);

        // Tester la méthode size() du pokedex
        assertEquals(0, pokedex.size());
    }

    @Test
    public void testAddPokemon() throws PokedexException {
        // Création d'un Pokémon fictif
        Pokemon expectedPokemon = new Pokemon(0, "Bulbizarre", 126, 126, 90, 13, 6, 4, 4, 56);

        // Definition du comportement attendu lorsque la méthode addPokemon est appelée avec le Pokémon fictif
        when(pokedex.addPokemon(expectedPokemon)).thenReturn(0); // Supposons que le Pokémon est ajouté avec succès à l'index 0

        // Ajout Pokémon au Pokédex
        int index = pokedex.addPokemon(expectedPokemon);

        // Vérification que l'index retourné correspond à celui attendu
        assertEquals(0, index);
    }

    @Test
    public void testGetPokemon() throws PokedexException {
        // Création d'un Pokémon fictif avec un identifiant donné
        int pokemonId = 1;
        Pokemon expectedPokemon = new Pokemon(0, "Bulbizarre", 126, 126, 90, 13, 6, 4, 4, 56);

        when(pokedex.getPokemon(pokemonId)).thenReturn(expectedPokemon);

        Pokemon actualPokemon = pokedex.getPokemon(pokemonId);

        assertEquals(expectedPokemon, actualPokemon);
    }

    @Test
    public void testGetPokemons() {
        // Création de quelques Pokémon fictifs
        Pokemon pokemon1 = new Pokemon(0, "Bulbizarre", 126, 126, 90, 13, 6, 4, 4, 56);
        Pokemon pokemon2 = new Pokemon(133,"Aquali", 186, 168, 260, 2729, 202, 5000, 4, 1);

        // Ajout des Pokémon fictifs à une liste
        List<Pokemon> expectedPokemons = new ArrayList<>();
        expectedPokemons.add(pokemon1);
        expectedPokemons.add(pokemon2);

        // Spécification du comportement de la methode getPokemons
        when(pokedex.getPokemons()).thenReturn(expectedPokemons);

        // Liste des Pokémon du Pokédex
        List<Pokemon> actualPokemons = pokedex.getPokemons();

        // Vérification que la liste retournée correspond à celle attendue
        assertEquals(expectedPokemons, actualPokemons);
    }





}
