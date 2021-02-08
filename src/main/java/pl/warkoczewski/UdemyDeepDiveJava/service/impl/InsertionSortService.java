package pl.warkoczewski.UdemyDeepDiveJava.service.impl;

import org.springframework.stereotype.Service;
import pl.warkoczewski.UdemyDeepDiveJava.service.SortService;
import pl.warkoczewski.UdemyDeepDiveJava.util.MyUtils;

@Service
public class InsertionSortService implements SortService {

    public InsertionSortService() {
        int[] sorted = sortAsc();
        System.out.println("Insertion");
        for(int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i]);
        }
    }

    @Override
    public int[] sortAsc() {
        int[] array = MyUtils.ARRAY_OF_NUMBERS;
        for(int firstUnSortedIndex = 1; firstUnSortedIndex < array.length; firstUnSortedIndex++) {
            int elementToShift = array[firstUnSortedIndex];
            int i;
            for (i = firstUnSortedIndex; i > 0 && array[firstUnSortedIndex -1] > elementToShift; i--) {
                array[i] = array[i-1];
            }
            array[i] = elementToShift;
        }
        return array;
    }

    private void swapNumbers(int[] array, int i, int j) {
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
