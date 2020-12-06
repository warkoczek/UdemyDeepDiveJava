package pl.warkoczewski.UdemyDeepDiveJava.repository;

import org.springframework.stereotype.Repository;

@Repository
public class NumberRepository {
    private final int[] array;

    public NumberRepository() {
        array = new int[]{30, 1, -10, 7, 13, 22, -1, 3, 0};
    }

    public int[] getArray() {
        return array;
    }
}
