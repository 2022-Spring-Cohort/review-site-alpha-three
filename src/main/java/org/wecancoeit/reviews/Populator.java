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
        Console console1 = new Console("Sega Genesis", "Sega", "08/14/1989", "Console","/Images/sega.png");
        consoleRepo.save(console1);
        Console console2 = new Console("Nintendo Gameboy", "Nintendo", "1989", "Handheld", "/Images/gameboy.png");
        consoleRepo.save(console2);
        Console console3 = new Console("Nintendo SNES", "Nintendo", "11/21/1990", "Console", "/Images/SNES.png");
        consoleRepo.save(console3);
        Console console4 = new Console("Sega Gamegear", "Sega", "10/6/1990", "Handheld", "/Images/gamegear.png");
        consoleRepo.save(console4);
        Console console5 = new Console("Playstation (1)", "Sony", "9/16/1995", "Console", "/Images/ps1.png");
        consoleRepo.save(console5);
        Console console6 = new Console("Sega Dreamcast", "Sega", "11/27/1998", "Console", "/Images/dreamcast.png");
        consoleRepo.save(console6);
        Console console7 = new Console("Playstation 2", "Sony", "3/4/2000", "Console", "/Images/ps2.png");
        consoleRepo.save(console7);
        Console console8 = new Console("Xbox (First gen)", "Microsoft", "11/15/2001", "Console", "/Images/xbox.png");
        consoleRepo.save(console8);
        Console console9 = new Console("Nintendo DS", "Nintendo", "11/21/2004", "Handheld", "/Images/Nintendo ds.png");
        consoleRepo.save(console9);
        Console console10 = new Console("Xbox 360", "Microsoft", "11/21/2005", "Console", "/Images/xbox360.png");
        consoleRepo.save(console10);
        Console console11 = new Console("Playstation 3", "Sony", "11/11/2006", "Console", "/Images/ps3.png");
        consoleRepo.save(console11);
        Console console12 = new Console("Nintendo Wii", "Nintendo", "11/19/2006", "Console", "/Images/wii.png");
        consoleRepo.save(console12);
        Console console13 = new Console("PS Vita", "Sony", "12/17/2011", "Handheld", "/Images/psvita.png");
        consoleRepo.save(console13);
        Console console14 = new Console("Playstation 4", "Sony", "11/15/2013", "Console", "/Images/ps4 console.png");
        consoleRepo.save(console14);
        Console console15 = new Console("Xbox One", "Microsoft", "11/22/2013", "Console", "/Images/xbox1.png");
        consoleRepo.save(console15);
        Console console16 = new Console("Nintendo Switch", "Nintendo", "3/3/2017", "Handheld", "/Images/switch.png");
        consoleRepo.save(console16);
        Console console17 = new Console("Xbox Series X", "Microsoft", "11/10/2020", "Console", "/Images/xbox series x.png");
        consoleRepo.save(console17);
        Console console18 = new Console("Playstation 5", "Sony", "11/10/2020", "Console", "/Images/ps5.png");
        consoleRepo.save(console18);

        Manufacturer manufacturer1 = new Manufacturer("Microsoft", console8, console9, console14, console16);
        manufacturerRepo.save(manufacturer1);
        Manufacturer manufacturer2 = new Manufacturer("Sony", console5, console7, console11, console13, console14, console18);
        manufacturerRepo.save(manufacturer2);
        Manufacturer manufacturer3 = new Manufacturer("Nintendo", console2, console3, console9, console12, console16);
        manufacturerRepo.save(manufacturer3);
        Manufacturer manufacturer4 = new Manufacturer("Sega", console1, console4, console6);
        manufacturerRepo.save(manufacturer4);
    }
}