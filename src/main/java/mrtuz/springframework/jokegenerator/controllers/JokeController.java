package mrtuz.springframework.jokegenerator.controllers;

import mrtuz.springframework.jokegenerator.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeGenereator) {
        this.jokeService = jokeGenereator;
    }


    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }
}
