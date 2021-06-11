package mrtuz.springframework.jokegenerator.controllers;

import mrtuz.springframework.jokegenerator.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {
    private final JokeService jokeGenereator;

    public JokeController(JokeService jokeGenereator) {
        this.jokeGenereator = jokeGenereator;
    }


    @GetMapping("/")
    public String getJoke(){
        return jokeGenereator.getJoke();
    }
}
