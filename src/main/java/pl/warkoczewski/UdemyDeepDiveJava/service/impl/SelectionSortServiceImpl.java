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
        for(int i = 0; i < sorted.length-1; i++){
            System.out.println(sorted[i]);
        }
    }

    @Override
    public int[] sortAsc() {
        int[] array = numberRepository.getArray();
        int lastUnsortedIndex = array.length-1;
        int indexOfLargest = 0;
        for(int i=lastUnsortedIndex; i > 0; i--){

            for(int j=1; j <=lastUnsortedIndex; j++){
                if(array[j] > array[indexOfLargest]){
                    indexOfLargest = j;
                }
            }
            int temp = array[lastUnsortedIndex];
            array[lastUnsortedIndex] = array[indexOfLargest];
            array[indexOfLargest] = temp;
            indexOfLargest = 0;
            lastUnsortedIndex--;
        }
        return array;
    }
}
