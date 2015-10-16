package com.javatoolbox;

import com.javatoolbox.groups.GroupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
    @Autowired
    private GroupsRepository groupsRepository;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("groups", groupsRepository.findAllByOrderByNameAsc());

        return "admin/index";
    }
}
