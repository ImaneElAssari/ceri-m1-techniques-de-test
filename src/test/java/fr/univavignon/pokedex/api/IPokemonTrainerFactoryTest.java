package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class IPokemonTrainerFactoryTest {
    private IPokedex pokedexMock;

    private PokemonTrainer trainerMock;
    private PokemonTrainer trainer;

    @Before
    public void setUp() {
        pokedexMock = mock(IPokedex.class);
        trainerMock = mock(PokemonTrainer.class);

        trainer = new PokemonTrainer("Ash", Team.MYSTIC, pokedexMock);
    }

    @Test
    public void testGetPokedex() {
        trainer.getPokedex();

        verify(pokedexMock).getPokemons();
    }

}
