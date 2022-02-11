package org.wecancoeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.repos.ConsoleRepository;


@Component
public class Populator implements CommandLineRunner {
    @Autowired
    ConsoleRepository consoleRepo;

    @Override
    public void run(String... args) throws Exception {
        Console NES = new Console(0l, "Nintendo", "1990", "cartridge", "console", "Yes", "Coax");

        consoleRepo.save(NES);

    }
}


