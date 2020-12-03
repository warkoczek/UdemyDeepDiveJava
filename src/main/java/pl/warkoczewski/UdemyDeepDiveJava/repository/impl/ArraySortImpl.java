package pl.warkoczewski.UdemyDeepDiveJava.repository.impl;

import org.springframework.stereotype.Service;
import pl.warkoczewski.UdemyDeepDiveJava.repository.Sort;
@Service
public class ArraySortImpl implements Sort {
    private final int[] array;

    public ArraySortImpl() {
        array = new int[]{30, 1, -10, 7, 13, 22, -1, 3, 27};
        bubbleSortDesc();
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    @Override
    public void bubbleSortDesc() {
        int last = array.length-1;
        while(last > 0) {
            traverseToLastUnsortedIndex(last);
            last--;
        }
    }
    private void traverseToLastUnsortedIndex(int last) {
        for(int i=0; i < last; i++){
            check(i, i +1);
        }
    }
    private void check(int i, int j){
        if(array[i] < array[i+1]) {
            swap(i, i + 1);
        }
    }
    private void swap(int i, int j) {
        if(i==j){
            return;
        }
        int temp = array[i];
        array[i] =array[j];
        array[j] = temp;
    }
}
