package com.javatoolbox.groups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GroupsController {
    @Autowired
    GroupsRepository groupsRepository;

    @RequestMapping(value = "/groups", method = RequestMethod.GET)
    public String groupIndex(Model model) {
        model.addAttribute("groups", groupsRepository.findAllByOrderByNameAsc());

        return "groups/index";
    }

    @RequestMapping(value = "/groups/{groupId}", method = RequestMethod.GET)
    public String groupShow(@PathVariable("groupId") Long groupId, Model model) {
        Group group = groupsRepository.findOne(groupId);

        model.addAttribute("group", group);

        return "groups/show";
    }
}