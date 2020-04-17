package dev.ronniemoncayo.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class DummyBusinessMockTest {

    @Test
    public void testFintTheGreatestFrommAllData() {

        DataService dataService = mock(DataService.class);

        when(dataService.retrieveAllData()).thenReturn(new int[] { 10, 20, 30, 40, 9 });

        DummyBusinessImpl dummyBusinessImpl = new DummyBusinessImpl(dataService);
        int result = dummyBusinessImpl.fintTheGreatestFrommAllData();
        assertEquals(40, result);
    }

    @Test
    public void testFintTheGreatestFrommAllData_forOneValue() {

        DataService dataService = mock(DataService.class);

        when(dataService.retrieveAllData()).thenReturn(new int[] { 10 });

        DummyBusinessImpl dummyBusinessImpl = new DummyBusinessImpl(dataService);
        int result = dummyBusinessImpl.fintTheGreatestFrommAllData();
        assertEquals(10, result);
    }
}