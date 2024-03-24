package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class IPokemonTrainerFactoryTest {

    private IPokemonTrainerFactory trainerFactory;
    private IPokedexFactory pokedexFactory;

    @Before
    public void setUp() {
        trainerFactory = mock(IPokemonTrainerFactory.class);
        pokedexFactory = mock(IPokedexFactory.class);

        IPokedex pokedexMock = mock(IPokedex.class);
        when(pokedexFactory.createPokedex(null, null)).thenReturn(pokedexMock);
    }

    @Test
    public void testCreateTrainer() {
        PokemonTrainer expectedTrainer = new PokemonTrainer("Red", Team.VALOR, null); // Créez un PokémonTrainer fictif
        when(trainerFactory.createTrainer("Red", Team.VALOR, pokedexFactory)).thenReturn(expectedTrainer);

        PokemonTrainer trainer = trainerFactory.createTrainer("Red", Team.VALOR, pokedexFactory);

        assertEquals(expectedTrainer.getName(), trainer.getName());
        assertEquals(expectedTrainer.getTeam(), trainer.getTeam());
    }
}
