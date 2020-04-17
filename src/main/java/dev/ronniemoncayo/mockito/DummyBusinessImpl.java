package dev.ronniemoncayo.mockito;

public class DummyBusinessImpl {

    DataService dataService;

    int fintTheGreatestFrommAllData(){
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for (int i : data) {
            if(i > greatest){
                greatest = i;
            }
        }
        return greatest;
    }

    public DummyBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

}