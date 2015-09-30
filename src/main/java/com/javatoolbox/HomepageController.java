package com.javatoolbox;

import com.javatoolbox.projects.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {
    @Autowired
    private ProjectsRepository projectsRepository;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("projects", projectsRepository.findAllByOrderByNameAsc());

        return "index";
    }
}
