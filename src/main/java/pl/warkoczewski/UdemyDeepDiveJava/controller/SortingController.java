package pl.warkoczewski.UdemyDeepDiveJava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SortingController {
    @GetMapping("/sort")
    public String displayInsertionSortPage(Model model){
        model.addAttribute("sortMessage", "Pick up sorting method");
        return "/sort/sort";
    }
}
