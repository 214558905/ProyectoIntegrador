package com.rafael.falconi.Api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import com.rafael.falconi.Api.entities.Groups;
import org.springframework.stereotype.Controller;
import com.rafael.falconi.Api.repositories.GroupsRepository;

import java.util.List;


@Controller
public class GroupsController {

    private GroupsRepository groupsRepository;

    @Autowired
    public GroupsController(GroupsRepository groupsRepository) {
        this.groupsRepository = groupsRepository;
    }

    public List<Groups> findAllGroups(){

        return this.groupsRepository.findAll();

    }
}