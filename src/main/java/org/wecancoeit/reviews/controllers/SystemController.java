package org.wecancoeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancoeit.reviews.repos.SystemRepository;

@Controller
public class SystemController {
    private SystemRepository systemRepo;

    public SystemController(SystemRepository systemRepo) {
        this.systemRepo = systemRepo;
    }

    @RequestMapping("/")
    public String showSystemPrototype(Model model) {
        model.addAttribute("System", systemRepo);
        return "SystemPrototype";
    }


}