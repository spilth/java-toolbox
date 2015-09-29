package com.javatoolbox.projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProjectsAdminController {
    @Autowired
    ProjectsRepository projectsRepository;

    @RequestMapping(value = "/admin/projects/new", method = RequestMethod.GET)
    public String projectNew() {
        return "projects/new";
    }

    @RequestMapping(value = "/admin/projects", method = RequestMethod.POST)
    public String projectCreate(Project project) {
        project = projectsRepository.save(project);

        return "redirect:/projects/" + project.getId();
    }
}
