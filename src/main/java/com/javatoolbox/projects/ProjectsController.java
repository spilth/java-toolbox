package com.javatoolbox.projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectsController {
    @Autowired
    ProjectsRepository projectsRepository;

    @RequestMapping(value = "/projects/{projectId}")
    public String projectShow(@PathVariable("projectId") Long projectId, Model model) {
        Project project = projectsRepository.findOne(projectId);

        model.addAttribute("project", project);

        return "projects/show";
    }
}