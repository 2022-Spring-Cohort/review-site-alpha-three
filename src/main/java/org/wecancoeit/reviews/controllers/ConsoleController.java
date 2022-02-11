package org.wecancoeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.repos.ConsoleRepository;

@Controller
public class ConsoleController {
    private ConsoleRepository consoleRepo;

    public ConsoleController(ConsoleRepository consoleRepo) {
        this.consoleRepo = consoleRepo;
    }

    @RequestMapping("/")
    public String showConsoleTemplate(Model model) {
        model.addAttribute("NES", consoleRepo.findById(0l).get());
        return "ConsoleTemplate";
    }

}
