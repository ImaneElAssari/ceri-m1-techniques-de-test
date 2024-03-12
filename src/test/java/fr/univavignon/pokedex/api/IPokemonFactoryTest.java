package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonFactoryTest {
    private IPokemonFactory mockProvider;

    @Before
    public void setUpMocks() {
        this.mockProvider = mock(IPokemonFactory.class);
        Pokemon expectedPokemon = new Pokemon(0, "Bulbizarre", 126, 126, 90, 13, 6, 4, 4, 56);
        when(mockProvider.createPokemon(0, 13, 6, 4, 4)).thenReturn(expectedPokemon);
        //when(mockProvider.createPokemon(index, invalidCp, invalidHp, invalidDust, invalidCandy)).thenThrow(new PokedexException("Invalid inputs"));
    }

    @Test
    public void testCreateValidPokemon() throws PokedexException {
        Pokemon actualPokemon = mockProvider.createPokemon(0, 13, 6, 4, 4);
        assertNotNull(actualPokemon);
        assertEquals("Bulbizarre", actualPokemon.getName());
        assertEquals(13, actualPokemon.getCp());
        assertEquals(6, actualPokemon.getHp());
        assertEquals(4, actualPokemon.getDust());
        assertEquals(4, actualPokemon.getCandy());
    }
    @Test(expected = PokedexException.class)
    public void testCreateInvalidPokemon_ThrowsException() throws PokedexException {
        // Given
        int invalidIndex = 1;
        int invalidCp = 613;
        int invalidHp = 64;
        int invalidDust = 4000;
        int invalidCandy = 444;

        assertTrue("Cp should be between 0 and 15", invalidHp >= 0 && invalidCp <= 15);
        assertTrue("Hp should be between 0 and 15", invalidHp >= 0 && invalidHp <= 15);
        assertTrue("Dust should be between 0 and 15", invalidDust >= 0 && invalidDust <= 15);
        assertTrue("Candy should be between 0 and 15", invalidCandy >= 0 && invalidCandy <= 15);


        IPokemonFactory mockProvider = mock(IPokemonFactory.class);
        when(mockProvider.createPokemon(invalidIndex, invalidCp, invalidHp, invalidDust, invalidCandy)).thenThrow(new PokedexException("Invalid index"));

        mockProvider.createPokemon(invalidIndex, invalidCp, invalidHp, invalidDust, invalidCandy);

    }
}
