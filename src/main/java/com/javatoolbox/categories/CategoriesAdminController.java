package com.javatoolbox.categories;

import com.javatoolbox.groups.Group;
import com.javatoolbox.groups.GroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/admin/categories")
public class CategoriesAdminController {
    @Autowired
    private CategoriesRepository categoriesRepository;

    @Autowired
    private GroupsRepository groupsRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String categoryIndex(Model model) {
        model.addAttribute("categories", categoriesRepository.findAllByOrderByNameAsc());

        return "admin/categories/index";
    }

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String categoryNew(Model model) {
        model.addAttribute("category", new Category());
        return "categories/new";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String categoryCreate(Category category) {
        category = categoriesRepository.save(category);

        return "redirect:/categories/" + category.getId();
    }

    @RequestMapping(value = "/{categoryId}/edit", method = RequestMethod.GET)
    public String categoryEdit(@PathVariable("categoryId") Long categoryId, Model model) {
        Category category = categoriesRepository.findOne(categoryId);

        model.addAttribute("category", category);

        return "categories/edit";
    }

    @RequestMapping(value = "/{categoryId}", method = RequestMethod.PUT)
    public String categoryUpdate(@PathVariable("categoryId") Long categoryId, Category category) {
        category.setId(categoryId);

        categoriesRepository.save(category);

        return "redirect:/categories/" + category.getId();
    }


    @ModelAttribute("groupsMap")
    private Map<String, String> getGroups() {
        Iterable<Group> groups = groupsRepository.findAll();

        Map<String, String> groupsMap = new HashMap();
        for (Group group : groups) {
            groupsMap.put(String.valueOf(group.getId()), group.getName());
        }

        return groupsMap;
    }
}
