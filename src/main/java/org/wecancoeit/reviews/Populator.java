package org.wecancoeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.entities.Hashtag;
import org.wecancoeit.reviews.entities.Manufacturer;
import org.wecancoeit.reviews.entities.Console;
import org.wecancoeit.reviews.repos.ConsoleRepository;
import org.wecancoeit.reviews.repos.HashtagRepository;
import org.wecancoeit.reviews.repos.ManufacturerRepository;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    ConsoleRepository consoleRepo;
    @Autowired
    ManufacturerRepository manufacturerRepo;
    @Autowired
    HashtagRepository hashtagRepo;

    @Override
    public void run(String... args) throws Exception {
        Console console1 = new Console("Sega Genesis", "Sega", "08/14/1989", "Console","The Sega Genesis, known as the Mega Drive outside North America, is a 16-bit fourth-generation home video game console developed and sold by Sega. The Genesis was Sega's third console and the successor to the Master System.", "/Images/sega.png");
        consoleRepo.save(console1);
        Console console2 = new Console("Nintendo Gameboy", "Nintendo", "1989", "Handheld", "Nintendo's second handheld game console, the Game Boy, combines features from both the NES home system and Game & Watch hardware. The console features a dot-matrix screen with adjustable contrast dial, five game control buttons (a directional pad, two game buttons, and \"START\" and \"SELECT\"), a single speaker with adjustable volume dial, and, like its rivals, uses cartridges as physical media for games.", "/Images/gameboy.png");
        consoleRepo.save(console2);
        Console console3 = new Console("Nintendo SNES", "Nintendo", "11/21/1990", "Console", "The Super NES is Nintendo's second programmable home console, following the Nintendo Entertainment System (NES). The console introduced advanced graphics and sound capabilities compared with other systems at the time. It was designed to accommodate the ongoing development of a variety of enhancement chips integrated into game cartridges to be competitive into the next generation.", "/Images/SNES.png");
        consoleRepo.save(console3);
        Console console4 = new Console("Sega Gamegear", "Sega", "10/6/1990", "Handheld", "The Game Gear primarily competed with Nintendo's Game Boy, the Atari Lynx, and NEC's TurboExpress. It shares much of its hardware with the Master System, and can play Master System games by the use of an adapter. Sega positioned the Game Gear, which had a full-color backlit screen with a landscape format, as a technologically superior handheld to the Game Boy.", "/Images/gamegear.png");
        consoleRepo.save(console4);
        Console console5 = new Console("Playstation (1)", "Sony", "9/16/1995", "Console", "The original PlayStation was the first of the ubiquitous PlayStation series of console and hand-held game devices. It was part of the fifth generation of video game consoles competing against the Sega Saturn and the Nintendo 64. It eventually became the first video game console to sell 120 million units.", "/Images/ps1.png");
        consoleRepo.save(console5);
        Console console6 = new Console("Sega Dreamcast", "Sega", "11/27/1998", "Console", "The Dreamcast was the first in the sixth generation of video game consoles, preceding Sony's PlayStation 2, Nintendo's GameCube, and Microsoft's Xbox. The Dreamcast was Sega's final home console, marking the end of the company's eighteen years in the console market.", "/Images/dreamcast.png");
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

        Hashtag hashtag1 = new Hashtag("#FamilyFun", console1, console4, console14);
        hashtagRepo.save(hashtag1);
    }
}