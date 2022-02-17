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
        Console console1 = new Console("Sega Genesis", "Sega", "08/14/1989", "Console");
        consoleRepo.save(console1);
        Console console2 = new Console("Nintendo Gameboy", "Nintendo", "1989", "Handheld");
        consoleRepo.save(console2);
        Console console3 = new Console("Nintendo SNES", "Nintendo", "11/21/1990", "Console");
        consoleRepo.save(console3);
        Console console4 = new Console("Sega Gamegear", "Sega", "10/6/1990", "Handheld");
        consoleRepo.save(console4);
        Console console5 = new Console("Playstation (1)", "Sony", "9/16/1995", "Console");
        consoleRepo.save(console5);
        Console console6 = new Console("Sega Dreamcast", "Sega", "11/27/1998", "Console");
        consoleRepo.save(console6);
        Console console7 = new Console("Playstation 2", "Sony", "3/4/2000", "Console");
        consoleRepo.save(console7);
        Console console8 = new Console("Xbox (First gen)", "Microsoft", "11/15/2001", "Console");
        consoleRepo.save(console8);
        Console console9 = new Console("Nintendo DS", "Nintendo", "11/21/2004", "Handheld");
        consoleRepo.save(console9);
        Console console10 = new Console("Xbox 360", "Microsoft", "11/21/2005", "Console");
        consoleRepo.save(console10);
        Console console11 = new Console("Playstation 3", "Sony", "11/11/2006", "Console");
        consoleRepo.save(console11);
        Console console12 = new Console("Nintendo Wii", "Nintendo", "11/19/2006", "Console");
        consoleRepo.save(console12);
        Console console13 = new Console("PS Vita", "Sony", "12/17/2011", "Handheld");
        consoleRepo.save(console13);
        Console console14 = new Console("Playstation 4", "Sony", "11/15/2013", "Console");
        consoleRepo.save(console14);
        Console console15 = new Console("Xbox One", "Microsoft", "11/22/2013", "Console");
        consoleRepo.save(console15);
        Console console16 = new Console("Nintendo Switch", "Nintendo", "3/3/2017", "Handheld");
        consoleRepo.save(console16);
        Console console17 = new Console("Xbox Series X", "Microsoft", "11/10/2020", "Console");
        consoleRepo.save(console17);
        Console console18 = new Console("Playstation 5", "Sony", "11/10/2020", "Console");
        consoleRepo.save(console18);



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