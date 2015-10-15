package com.javatoolbox;

import com.javatoolbox.groups.GroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {
    @Autowired
    private GroupsRepository groupsRepository;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("groups", groupsRepository.findAllByOrderByNameAsc());

        return "index";
    }
}
