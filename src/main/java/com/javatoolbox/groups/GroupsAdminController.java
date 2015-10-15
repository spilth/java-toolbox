package com.javatoolbox.groups;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/groups")
public class GroupsAdminController {
    @Autowired
    GroupsRepository groupsRepository;

    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String groupNew(Model model) {
        model.addAttribute("group", new Group());
        return "groups/new";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String groupCreate(Group group) {
        group = groupsRepository.save(group);

        return "redirect:/groups/" + group.getId();
    }

    @RequestMapping(value = "/{groupId}/edit", method = RequestMethod.GET)
    public String groupEdit(@PathVariable("groupId") Long groupId, Model model) {
        Group group = groupsRepository.findOne(groupId);

        model.addAttribute("group", group);

        return "groups/edit";
    }

    @RequestMapping(value = "/{groupId}", method = RequestMethod.PUT)
    public String groupUpdate(@PathVariable("groupId") Long groupId, Group group) {
        group.setId(groupId);

        groupsRepository.save(group);

        return "redirect:/groups/" + group.getId();
    }
}
