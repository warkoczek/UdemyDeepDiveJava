package pl.warkoczewski.UdemyDeepDiveJava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InsertionSortController {
    @GetMapping
    public String displayInsertionSortPage(Model model){
        return "/sort/insertionSort";
    }
}
