package org.wecancoeit.reviews.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import org.wecancoeit.reviews.entities.Manufacturer;
import org.wecancoeit.reviews.repos.ManufacturerRepository;

import java.util.Optional;

@Controller
public class ManufacturerController {
    private ManufacturerRepository manufacturerRepo;

    public ManufacturerController(ManufacturerRepository manufacturerRepo) {
        this.manufacturerRepo = manufacturerRepo;
    }


    @RequestMapping("/manufacturers/{id}")
    public String showManufacturerPage(Model model, @PathVariable Long id) {
        Optional<Manufacturer> tempManufacturer = manufacturerRepo.findById(id);
        if (tempManufacturer.isPresent()) {
            model.addAttribute("inManufacturer", tempManufacturer.get());
        }
        return "ManufacturerTemplate";
    }
}
