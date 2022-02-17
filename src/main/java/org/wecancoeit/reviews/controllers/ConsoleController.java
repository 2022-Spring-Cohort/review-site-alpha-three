package org.wecancoeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/")
    public String showIndexTemplate(Model model) {
        model.addAttribute("consoles", consoleRepo.findAll());
        return "indexTemplate";
    }

    @GetMapping("/consoles")
    public String showConsolesemplate(Model model) {
        model.addAttribute("consoles", consoleRepo.findAll());
        return "ConsolesTemplate";
    }

    @GetMapping("/consoles/{id}")
    public String showConsoleTemplate(Model model, @PathVariable long id) {
        Optional<Console> tempConsole = consoleRepo.findById(id);
        if (tempConsole.isPresent()) {
            model.addAttribute("inConsole", tempConsole.get());
        }
        return "ConsoleTemplate";
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