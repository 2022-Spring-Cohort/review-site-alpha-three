package org.wecancoeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.entities.Console;
import org.wecancoeit.reviews.repos.ConsoleRepository;
import java.util.Optional;

@Controller
public class ConsoleController {
    private ConsoleRepository consoleRepo;

    public ConsoleController(ConsoleRepository consoleRepo) {
        this.consoleRepo = consoleRepo;
    }

    @RequestMapping("/")
    public String showConsoleTemplate(Model model) {
        model.addAttribute("console", consoleRepo.findAll());
        return "ConsoleTemplate";
    }

    @RequestMapping("/consoles/{id}")
    public String showConsoleTemplate(Model model, @PathVariable long id) {
        Optional<Console> tempConsole = consoleRepo.findById(id);
        if (tempConsole.isPresent()) {
            model.addAttribute("inConsole", tempConsole.get());
        }
        return "BookTemplate";
    }

    @RequestMapping("/consoles/name/{name}")
    public String showConsoleByName(Model model, @PathVariable String name) {
        Optional<Console> tempConsole = consoleRepo.findByNameIgnoreCase(name);
        if (tempConsole.isPresent()) {
            model.addAttribute("inBook", tempConsole.get());
        }
        return "ConsoleTemplate";
    }

}