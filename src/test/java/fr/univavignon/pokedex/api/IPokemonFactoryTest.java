package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonFactoryTest {
    private IPokemonFactory mockProvider;

    @Before
    public void setUpMocks() {
        this.mockProvider = mock(IPokemonFactory.class);
        /*int index = 0;
        int invalidCp = 613;
        int invalidHp = 64;
        int invalidDust = 4000;
        int invalidCandy = 4;*/
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
}
