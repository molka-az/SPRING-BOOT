package tn.spring.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.spring.springboot.Services.IContratService;

@RestController
public class DetailEquipeController {

    @Autowired
    IContratService cS;

    public DetailEquipeController(){

    }
}
