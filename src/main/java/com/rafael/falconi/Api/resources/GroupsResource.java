package com.rafael.falconi.Api.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rafael.falconi.Api.controllers.GroupsController;
import com.rafael.falconi.Api.entities.Groups;
import java.util.List;

@RestController
@RequestMapping (GroupsResource.GROUPS)
public class GroupsResource {

    public static final String GROUPS = "/groups";
    public static final String ID = "/{id}";

    private GroupsController groupsController;

    @Autowired
    public GroupsResource(GroupsController groupsController) {
        this.groupsController = groupsController;
    }

    @GetMapping
    public List<Groups> getAllGroups() {

        return this.groupsController.findAllGroups();
    }
}