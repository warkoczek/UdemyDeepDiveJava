package pl.warkoczewski.UdemyDeepDiveJava.service.impl;

import org.springframework.stereotype.Service;
import pl.warkoczewski.UdemyDeepDiveJava.repository.NumberRepository;
import pl.warkoczewski.UdemyDeepDiveJava.service.SelectionSortService;

@Service
public class SelectionSortServiceImpl implements SelectionSortService {
    private final NumberRepository numberRepository;

    public SelectionSortServiceImpl(NumberRepository numberRepository) {
        this.numberRepository = numberRepository;
        int[] sorted = sortAsc();
        for(int i = 0; i < sorted.length; i++){
            System.out.println(sorted[i]);
        }
    }

    @Override
    public int[] sortAsc() {
        int[] array = numberRepository.getArray();
        int indexOfLargest = 0;
        int last = array.length-1;
        traverse(array, last, indexOfLargest);
        return array;
    }

    private void traverse(int[] array, int last, int indexOfLargest) {
        while(last > 0) {
            updateIndexOfLargest(array, last,  indexOfLargest);
            swap(array, last, indexOfLargest);
        }
    }

    private void updateIndexOfLargest(int[] array, int last, int indexOfLargest) {
        for(int i=1; i <= last; i++){
            if(array[i] > array[indexOfLargest]){
                indexOfLargest = i;
            }
        }
    }

    private void swap(int[] array, int lastUnsortedIndex, int indexOfLargest) {
        int temp = array[lastUnsortedIndex];
        array[lastUnsortedIndex] = array[indexOfLargest];
        array[indexOfLargest] = temp;
    }
}
