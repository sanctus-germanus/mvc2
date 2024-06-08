package ru.max.springsourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AllListController {
    @GetMapping("people")
    public String peopleList () {
        return "views_common/all_people";
    }
    @GetMapping("books")
    public String booksList () {
        return "views_common/all_books";
    }
}
