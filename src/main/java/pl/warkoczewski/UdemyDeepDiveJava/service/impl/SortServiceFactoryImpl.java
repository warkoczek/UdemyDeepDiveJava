package pl.warkoczewski.UdemyDeepDiveJava.service.impl;

import org.springframework.stereotype.Service;
import pl.warkoczewski.UdemyDeepDiveJava.model.SortType;
import pl.warkoczewski.UdemyDeepDiveJava.service.SortService;
import pl.warkoczewski.UdemyDeepDiveJava.service.SortServiceFactory;
import pl.warkoczewski.UdemyDeepDiveJava.util.MyUtils;

import java.util.Optional;

@Service
public class SortServiceFactoryImpl implements SortServiceFactory {

    @Override
    public Optional<SortService> getSortService(SortType sortType) {
        return Optional.of(MyUtils.SORT_SERVICE_MAP.get(sortType));
    }
}
