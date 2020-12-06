package pl.warkoczewski.UdemyDeepDiveJava.service;

public interface BubbleSortService {
    //stable when two numbers are the same, preserves order if < or > used not when =< or >=
    int[] sortAsc();
}
