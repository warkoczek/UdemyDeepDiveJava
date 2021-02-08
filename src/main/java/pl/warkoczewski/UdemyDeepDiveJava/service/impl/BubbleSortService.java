package pl.warkoczewski.UdemyDeepDiveJava.service.impl;

import org.springframework.stereotype.Service;
import pl.warkoczewski.UdemyDeepDiveJava.repository.NumberRepository;
import pl.warkoczewski.UdemyDeepDiveJava.service.SortService;
import pl.warkoczewski.UdemyDeepDiveJava.util.MyUtils;

@Service
public class BubbleSortService implements SortService {
    public BubbleSortService() {
        int[] sorted = sortAsc();
        System.out.println("Bubble");
        for(int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i]);
        }
    }
    //stable when two numbers are the same, preserves order if < or > used not when =< or >=
    @Override
    public int[] sortAsc() {
        int[] array = MyUtils.ARRAY_OF_NUMBERS;
        int last = array.length-1;
        while(last > 0) {
            traverseToLastUnsortedIndex(array, last);
            last--;
        }
        return array;
    }
    private void traverseToLastUnsortedIndex(int[] array, int last) {
        for(int i=0; i < last; i++){
            check(array, i);
        }
    }
    private void check(int[] array, int i){
        if(array[i] > array[i+1]) {
            swap(array, i, i + 1);
        }
    }
    private void swap(int[] array, int i, int j) {
        if(i==j){
            return;
        }
        int temp = array[i];
        array[i] =array[j];
        array[j] = temp;
    }
}
