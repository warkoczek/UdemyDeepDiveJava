package pl.warkoczewski.UdemyDeepDiveJava.dto;

import pl.warkoczewski.UdemyDeepDiveJava.model.SortType;

public class SortDataDTO {
    private SortType sortType;

    public SortDataDTO() {
    }
    public SortDataDTO(SortType sortType) {
        this.sortType = sortType;
    }

    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }
}
