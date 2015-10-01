package com.javatoolbox.categories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoriesController {
    @Autowired
    CategoriesRepository categoriesRepository;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public String categoryIndex(Model model) {
        model.addAttribute("categories", categoriesRepository.findAll());

        return "categories/index";
    }

    @RequestMapping(value = "/categories/{categoryId}", method = RequestMethod.GET)
    public String categoryShow(@PathVariable("categoryId") Long categoryId, Model model) {
        Category category = categoriesRepository.findOne(categoryId);

        model.addAttribute("category", category);

        return "categories/show";
    }
}