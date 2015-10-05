package com.javatoolbox.projects;

import com.javatoolbox.categories.CategoriesRepository;
import com.javatoolbox.categories.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ProjectsController {
    @Autowired
    ProjectsRepository projectsRepository;

    @Autowired
    private CategoriesRepository categoriesRepository;

    @RequestMapping(value = "/projects/{projectId}")
    public String projectShow(@PathVariable("projectId") Long projectId, Model model) {
        Project project = projectsRepository.findOne(projectId);

        model.addAttribute("project", project);

        return "projects/show";
    }

    @RequestMapping(value = "/projects/new", method = RequestMethod.GET)
    public String projectNew(Model model) {
        model.addAttribute("project", new Project());
        return "projects/new_submission";
    }

    @RequestMapping(value = "/projects", method = RequestMethod.POST)
    public String projectCreate(@Valid Project project, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("project", project);
            return "projects/new_submission";
        } else {
            project.setEnabled(false);
            projectsRepository.save(project);
            return "projects/thank_you";
        }
    }

    @ModelAttribute("categoriesMap")
    private Map<String, String> getCategories() {
        Iterable<Category> categories = categoriesRepository.findAllByOrderByNameAsc();

        Map<String, String> categoriesMap = new HashMap();
        for (Category category : categories) {
            categoriesMap.put(String.valueOf(category.getId()), category.getName());
        }

        return categoriesMap;
    }
}