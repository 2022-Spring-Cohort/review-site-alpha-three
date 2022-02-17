package org.wecancoeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.entities.Manufacturer;
import org.wecancoeit.reviews.entities.Console;
import org.wecancoeit.reviews.repos.ConsoleRepository;
import org.wecancoeit.reviews.repos.ManufacturerRepository;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    ConsoleRepository consoleRepo;
    @Autowired
    ManufacturerRepository manufacturerRepo;

    @Override
    public void run(String... args) throws Exception {
        Console console = new Console("Sega Genesis", "Sega", "08/14/1989", "Console");
        consoleRepo.save(console);
        Console console2 = new Console("Nintendo Gameboy", "Nintendo", "1989", "Handheld");
        consoleRepo.save(console2);
        Console console3 = new Console("Nintendo SNES", "Nintendo", "11/21/1990", "Console");
        consoleRepo.save(console3);
        Console console4 = new Console("Xbox", "Microsoft", "11/15/2001", "Console");
        consoleRepo.save(console4);

        Manufacturer manufacturer = new Manufacturer("Microsoft", console4);
        manufacturerRepo.save(manufacturer);
        Manufacturer manufacturer2 = new Manufacturer("Sony");
        Manufacturer manufacturer3 = new Manufacturer("Nintendo");
        Manufacturer manufacturer4 = new Manufacturer("Sega", console);

        // author4.addBook(book2); Only when using addBook method

//        manufacturerRepo.save(manufacturer2);
//        manufacturerRepo.save(manufacturer3);
//        manufacturerRepo.save(manufacturer4);
//        manufacturerRepo.save(manufacturer4);

    }
}