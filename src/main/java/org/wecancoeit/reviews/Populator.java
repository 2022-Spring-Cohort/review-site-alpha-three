package org.wecancoeit.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancoeit.reviews.repos.SystemRepository;

@Component
public class Populator implements CommandLineRunner {
    @Autowired
    SystemRepository systemRepo;

    @Override
    public void run(String... args) throws Exception {
        System system = new System("NES", "Nintendo", "1990", "Cartride", "Console", "Yes", "Coax", 10);

        systemRepo.save(system);
    }
}
