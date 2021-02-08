package pl.warkoczewski.UdemyDeepDiveJava.util;

import pl.warkoczewski.UdemyDeepDiveJava.model.SortType;
import pl.warkoczewski.UdemyDeepDiveJava.service.SortService;
import pl.warkoczewski.UdemyDeepDiveJava.service.impl.BubbleSortService;
import pl.warkoczewski.UdemyDeepDiveJava.service.impl.InsertionSortService;
import pl.warkoczewski.UdemyDeepDiveJava.service.impl.SelectionSortService;
import pl.warkoczewski.UdemyDeepDiveJava.service.impl.ShellSortService;

import java.util.HashMap;
import java.util.Map;

public class MyUtils {
    public static final int[] ARRAY_OF_NUMBERS = new int[]{30, 1, -10, 7, 13, 22, -1, 3, 0};
    public static final Map<SortType, SortService> SORT_SERVICE_MAP = new HashMap<>();
    static {
        SORT_SERVICE_MAP.put(SortType.BUBBLE, new BubbleSortService());
        SORT_SERVICE_MAP.put(SortType.INSERTION, new InsertionSortService());
        SORT_SERVICE_MAP.put(SortType.SELECTION, new SelectionSortService());
        SORT_SERVICE_MAP.put(SortType.SHELL, new ShellSortService());
    }

    public MyUtils() {
    }
}
