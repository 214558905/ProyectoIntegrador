package com.rafael.falconi.Api.resources;
import com.rafael.falconi.Api.controllers.RulesController;
import com.rafael.falconi.Api.entities.Rules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(RulesResource.RULES)
public class RulesResource {

    public static final String RULES="/rules";

    private RulesController rulesController;


    @Autowired
    public RulesResource(RulesController rulesController) {
        this.rulesController = rulesController;
    }

    @GetMapping
    public List<Rules> getAllRules(){

        return this.rulesController.findAllRule();
    }

}
