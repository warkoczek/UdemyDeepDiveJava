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
        getSortedArray(array);
        return array;

    }

    private void getSortedArray(int[] array) {
        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int indexOfLargest = getAndSetIndexOfLargest(array, lastUnsortedIndex);
            swap(array, lastUnsortedIndex, indexOfLargest);
        }
    }

    private int getAndSetIndexOfLargest(int[] array, int lastUnsortedIndex) {
        int indexOfLargest = 0;
        for(int i = 1; i <= lastUnsortedIndex; i++){
            if(array[i] > array[indexOfLargest]){
                indexOfLargest = i;
            }
        }
        return indexOfLargest;
    }

    private void swap(int[] array, int lastUnsortedIndex, int indexOfLargest) {
        if( lastUnsortedIndex == indexOfLargest){
            return;
        }
        int temp = array[lastUnsortedIndex];
        array[lastUnsortedIndex] = array[indexOfLargest];
        array[indexOfLargest] = temp;
    }
}
