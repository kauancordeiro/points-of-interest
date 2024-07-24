package dev.cordeiro.poinst_of_interest.controller;

import dev.cordeiro.poinst_of_interest.entites.POIs;
import dev.cordeiro.poinst_of_interest.services.POIsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/pois")
public class POIsController {


    @Autowired
    private POIsService poisService;


    @PostMapping
    ResponseEntity<POIs> insert (@RequestBody POIs pois){
        POIs p = poisService.insert(pois);
        if(p != null){
            return ResponseEntity.ok().body(p);
        }else{
            return ResponseEntity.badRequest().build();
        }
    }

}
