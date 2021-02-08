package pl.warkoczewski.UdemyDeepDiveJava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.warkoczewski.UdemyDeepDiveJava.dto.SortDataDTO;
import pl.warkoczewski.UdemyDeepDiveJava.model.SortType;
import pl.warkoczewski.UdemyDeepDiveJava.service.SortServiceFactory;

@Controller
public class SortingController {
    private final SortServiceFactory sortServiceFactory;

    public SortingController(SortServiceFactory sortServiceFactory) {
        this.sortServiceFactory = sortServiceFactory;
    }

    @GetMapping("/sort")
    public String displaySortingPage(Model model){
        model.addAttribute("sortMessage", "Pick up sorting method");
        model.addAttribute("sortDataDTO", new SortDataDTO());
        model.addAttribute("sortTypes", SortType.values());
        return "/sort/sort";
    }
    @PostMapping("/sort/sortingForm")
    public String processSortingPage(@ModelAttribute("sortDataDTO")SortDataDTO sortDataDTO){
        sortServiceFactory.getSortService(sortDataDTO.getSortType());
        return "/sort/sort";
    }
}
