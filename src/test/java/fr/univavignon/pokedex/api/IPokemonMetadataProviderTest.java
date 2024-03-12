package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonMetadataProviderTest {
    private IPokemonMetadataProvider mockProvider;
    @Before
    public void setUpMocks() throws PokedexException {
        this.mockProvider = mock(IPokemonMetadataProvider.class);//creation objet mock
        int index = 10;
        int invalidIndex = 150;
        PokemonMetadata expectedMetadata = new PokemonMetadata(index, "Fire", 5, 5, 5);
        when(mockProvider.getPokemonMetadata(index)).thenReturn(expectedMetadata);
        when(mockProvider.getPokemonMetadata(invalidIndex)).thenThrow(new PokedexException("Invalid index"));



    }
    @Test
    public void testGetPokemonMetadata_WithValidIndex_ReturnsMetadata() throws PokedexException {

        // When
        PokemonMetadata actualMetadata = mockProvider.getPokemonMetadata(10);

        // Then
        assertNotNull(actualMetadata.getName());
        assertEquals("Fire", actualMetadata.getName());
        assertEquals(5, actualMetadata.getAttack());
        assertEquals(5, actualMetadata.getDefense());
        assertEquals(5, actualMetadata.getStamina());
    }

    @Test(expected = PokedexException.class)
    public void testGetPokemonMetadata_WithInvalidIndex_ThrowsException() throws PokedexException {
        // Given
        int invalidIndex = 150;

        // Assert that the invalid index is between 0 and 150
        assertTrue("Invalid index should be between 0 and 150", invalidIndex >= 0 && invalidIndex <= 150);

        IPokemonMetadataProvider mockProvider = mock(IPokemonMetadataProvider.class);
        when(mockProvider.getPokemonMetadata(invalidIndex)).thenThrow(new PokedexException("Invalid index"));

        // When
        mockProvider.getPokemonMetadata(invalidIndex);

        // Then: Expected to throw PokedexException
    }

}
