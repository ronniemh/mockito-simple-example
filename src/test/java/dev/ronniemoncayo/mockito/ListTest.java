package dev.ronniemoncayo.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ListTest {

    @Test
    public void testListSize() {
        List list = mock(List.class);
        when(list.size()).thenReturn(10);
        assertEquals(10, list.size());
    }

    @Test
    public void testListSize_multipleReturns() {
        List list = mock(List.class);
        when(list.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, list.size());
        assertEquals(20, list.size());
        assertEquals(20, list.size());
    }

    @Test
    public void testGet_parameter() {
        List list = mock(List.class);
        when(list.get(2)).thenReturn("OK");
        assertEquals("OK", list.get(2));
        assertEquals(null, list.get(3));
    }

    @Test
    public void testGet_genericParameter() {
        List list = mock(List.class);
        when(list.get(Mockito.anyInt())).thenReturn("OK");
        assertEquals("OK", list.get(2));
        assertEquals("OK", list.get(100));
    }

}