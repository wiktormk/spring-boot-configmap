package me.springboot.configmap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import me.springboot.configmap.configuration.GreetingsConfiguration;

@RestController
@RequestMapping("/v1/rest")
public class GreetingsController {

    @Autowired
    private GreetingsConfiguration greetingsConfiguration;
    
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        String helloWorld = new Gson().toJson("Hello World from " + greetingsConfiguration.getFrom() + "!!!");
        return new ResponseEntity<>(helloWorld, HttpStatus.OK);
    }

}
