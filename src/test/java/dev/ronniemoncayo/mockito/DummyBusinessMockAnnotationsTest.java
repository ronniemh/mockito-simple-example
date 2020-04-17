package dev.ronniemoncayo.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class DummyBusinessMockAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    DummyBusinessImpl businessMock;

    @Test
    public void testFintTheGreatestFrommAllData() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 10, 20, 30, 40, 9 });
        assertEquals(40, businessMock.fintTheGreatestFrommAllData());
    }

    @Test
    public void testFintTheGreatestFrommAllData_forOneValue() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 10 });
        assertEquals(10, businessMock.fintTheGreatestFrommAllData());
    }
}