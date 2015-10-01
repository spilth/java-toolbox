package com.javatoolbox.projects;

import com.javatoolbox.categories.CategoriesRepository;
import com.javatoolbox.categories.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ProjectsAdminController {
    @Autowired
    private ProjectsRepository projectsRepository;

    @Autowired
    private CategoriesRepository categoriesRepository;

    @RequestMapping(value = "/admin/projects/new", method = RequestMethod.GET)
    public String projectNew(Model model) {
        model.addAttribute("project", new Project());
        return "projects/new";
    }

    @RequestMapping(value = "/admin/projects", method = RequestMethod.POST)
    public String projectCreate(Project project, @RequestParam Long categoryId) {
        project = projectsRepository.save(project);

        return "redirect:/projects/" + project.getId();
    }

    @RequestMapping(value = "/admin/projects/{projectId}/edit", method = RequestMethod.GET)
    public String projectEdit(@PathVariable("projectId") Long projectId, Model model) {
        Project project = projectsRepository.findOne(projectId);

        model.addAttribute("project", project);

        return "projects/edit";
    }

    @RequestMapping(value = "/admin/projects/{projectId}", method = RequestMethod.PUT)
    public String projectUpdate(@PathVariable("projectId") Long projectId, Project project) {
        project.setId(projectId);

        projectsRepository.save(project);

        return "redirect:/projects/" + project.getId();
    }

    @ModelAttribute("categoriesMap")
    private Map<String, String> getCategories() {
        Iterable<Category> categories = categoriesRepository.findAll();

        Map<String, String> categoriesMap = new HashMap();
        for (Category category : categories) {
            categoriesMap.put(String.valueOf(category.getId()), category.getName());
        }

        return categoriesMap;
    }
}
