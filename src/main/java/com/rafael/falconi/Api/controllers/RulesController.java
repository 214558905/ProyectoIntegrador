package com.rafael.falconi.Api.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.rafael.falconi.Api.entities.Rules;
import org.springframework.stereotype.Controller;

import com.rafael.falconi.Api.repositories.RuleRepository;

@Controller
public class RulesController {
    private RuleRepository ruleRepository;



    @Autowired
    public RulesController(RuleRepository ruleRepository) {
        this.ruleRepository = ruleRepository;
    }

    public List<Rules> findAllRule(){

        return this.ruleRepository.findAll();

    }


}
