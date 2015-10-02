package com.javatoolbox;

import com.javatoolbox.categories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {
    @Autowired
    private CategoriesRepository categoriesRepository;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("categories", categoriesRepository.findAllByOrderByNameAsc());

        return "index";
    }
}
