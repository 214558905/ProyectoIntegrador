package com.rafael.falconi.Api.resources;
import com.rafael.falconi.Api.controllers.RulesController;
import com.rafael.falconi.Api.controllers.WhoareController;
import com.rafael.falconi.Api.entities.WhoAre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(WhoareResource.WHOARE)
public class WhoareResource {
    public static final String WHOARE="/whoare";

    private WhoareController WhoareController;


    @Autowired
    public WhoareResource(WhoareController whoareController) {
        this.WhoareController = whoareController;
    }

    @GetMapping
    public List<WhoAre> getAllWhoare(){

        return this.WhoareController.findAllWhoare();
    }

}
