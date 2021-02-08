package pl.warkoczewski.UdemyDeepDiveJava.service;

import pl.warkoczewski.UdemyDeepDiveJava.model.SortType;

import java.util.Optional;

public interface SortServiceFactory {
    Optional<SortService> getSortService(SortType sortType);
}
