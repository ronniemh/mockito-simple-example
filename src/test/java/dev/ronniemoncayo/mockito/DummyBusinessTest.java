package dev.ronniemoncayo.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DummyBusinessTest {

    @Test
    public void testFintTheGreatestFrommAllData(){
        DummyBusinessImpl dummyBusinessImpl = new DummyBusinessImpl(new DummyBusinessStub());
        int result = dummyBusinessImpl.fintTheGreatestFrommAllData();
        assertEquals(231, result);
    }
}

class DummyBusinessStub implements DataService{

    @Override
    public int[] retrieveAllData() {
        return new int[]{21,231,22,123};
    }
    
}