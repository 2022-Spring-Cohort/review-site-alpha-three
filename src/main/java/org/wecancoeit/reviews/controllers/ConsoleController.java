package org.wecancoeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.wecancoeit.reviews.entities.Console;
import org.wecancoeit.reviews.entities.Review;
import org.wecancoeit.reviews.repos.ConsoleRepository;
import org.wecancoeit.reviews.repos.ReviewRepository;

import java.util.Optional;

@Controller
public class ConsoleController {
    private ConsoleRepository consoleRepo;
    private ReviewRepository reviewRepo;


    public ConsoleController(ConsoleRepository consoleRepo, ReviewRepository reviewRepo) {
        this.consoleRepo = consoleRepo;
        this.reviewRepo = reviewRepo;
    }

    @GetMapping("/")
    public String showIndexTemplate(Model model) {
        model.addAttribute("consoles", consoleRepo.findAll());
        return "indexTemplate";
    }

    @GetMapping("/consoles")
    public String showConsolesTemplate(Model model) {
        model.addAttribute("consoles", consoleRepo.findAll());
        model.addAttribute("filterName", "All Consoles");
        return "ConsolesTemplate";
    }

    @GetMapping("/console/{id}")
    public String showConsoleTemplate(Model model, @PathVariable long id) {
        Optional<Console> tempConsole = consoleRepo.findById(id);
        if (tempConsole.isPresent()) {
            model.addAttribute("inConsole", tempConsole.get());
        }
        return "ConsoleTemplate";
    }
    @PostMapping("/console/{id}")
    public String addReviewToConsole(@PathVariable long id, @RequestParam String review, @RequestParam String name) {
        Optional<Console> tempConsole = consoleRepo.findById(id);
        if (tempConsole.isPresent()) {
            Review tempReview = new Review(name, review, tempConsole.get());
            reviewRepo.save(tempReview);
        }
        return "redirect:/console/" + id;
    }

    @GetMapping("/consoles/name/{name}")
    public String showConsoleByName(Model model, @PathVariable String name) {
        Optional<Console> tempConsole = consoleRepo.findByNameIgnoreCase(name);
        if (tempConsole.isPresent()) {
            model.addAttribute("inConsole", tempConsole.get());
        }
        return "ConsolesTemplate";
    }

}