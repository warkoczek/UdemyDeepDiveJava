package pl.warkoczewski.UdemyDeepDiveJava.service.impl;

import org.springframework.stereotype.Service;
import pl.warkoczewski.UdemyDeepDiveJava.repository.NumberRepository;
import pl.warkoczewski.UdemyDeepDiveJava.service.SortService;
import pl.warkoczewski.UdemyDeepDiveJava.util.MyUtils;

@Service
public class ShellSortService implements SortService {

    public ShellSortService() {
        int[] sorted = sortAsc();
        System.out.println("Shell Sort");
        for(int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i]);
        }

    }

    @Override
    public int[] sortAsc() {
        int[] array = MyUtils.ARRAY_OF_NUMBERS;
        sortArray(array);
        return array;
    }

    private void sortArray(int[] array) {
        //traverse using the gap
        for(int gap = array.length/2; gap > 0; gap /= 2){
            //traverse for each gap
            for(int i = gap; i < array.length; i++){
                int newElement = array[i];
                int j = i;
                // insertion sort
                while(j >= gap && array[j - gap] > newElement){
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
    }
}
