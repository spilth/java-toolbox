package com.javatoolbox;

import com.javatoolbox.projects.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
    @Autowired
    private ProjectsRepository projectsRepository;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("projects", projectsRepository.findAllByOrderByNameAsc());

        return "admin/index";
    }
}
