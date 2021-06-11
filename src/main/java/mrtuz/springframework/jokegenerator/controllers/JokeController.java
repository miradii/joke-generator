package mrtuz.springframework.jokegenerator.controllers;

import mrtuz.springframework.jokegenerator.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }


    @GetMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        System.out.println("here");
        return "index";
    }
}
