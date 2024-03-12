package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokedexTest {

    private IPokedex mockPokedex;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void testSize() {
        when(mockPokedex.size()).thenReturn(5);
        assertEquals(5, mockPokedex.size());
    }

    @Test
    public void testAddPokemon() {
        Pokemon mockPokemon = mock(Pokemon.class);
        when(mockPokedex.addPokemon(mockPokemon)).thenReturn(1);
        assertEquals(1, mockPokedex.addPokemon(mockPokemon));
    }

    @Test
    public void testGetPokemon() throws PokedexException {
        Pokemon expectedPokemon = mock(Pokemon.class);
        when(mockPokedex.getPokemon(1)).thenReturn(expectedPokemon);
        assertEquals(expectedPokemon, mockPokedex.getPokemon(1));
    }

    @Test
    public void testGetPokemons() {
        List<Pokemon> expectedPokemons = new ArrayList<>();
        when(mockPokedex.getPokemons()).thenReturn(expectedPokemons);
        assertEquals(expectedPokemons, mockPokedex.getPokemons());
    }

    @Test
    public void testGetPokemonsWithComparator() {
        List<Pokemon> expectedPokemons = new ArrayList<>();
        Comparator<Pokemon> mockComparator = mock(Comparator.class);
        when(mockPokedex.getPokemons(mockComparator)).thenReturn(expectedPokemons);
        assertEquals(expectedPokemons, mockPokedex.getPokemons(mockComparator));
    }
}
