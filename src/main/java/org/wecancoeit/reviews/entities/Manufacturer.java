package org.wecancoeit.reviews.entities;
import org.wecancoeit.reviews.repos.ManufacturerRepository;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;
import java.util.Arrays;
import java.util.Collection;
import org.wecancoeit.reviews.entities.Console;

@Entity
public class Manufacturer {

    @Id
    @GeneratedValue
    public long id;
    public String name;


    @ManyToMany
    private Collection<Console> consoles ;

    public Manufacturer() {

    }

    public Manufacturer(String name, Console...consoles) {
        this.name = name;
        this.consoles = Arrays.asList(consoles);
    }

    public void addConsole(Console console) {
        consoles.add(console);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public Collection<Console> getConsoles() {
        return consoles;
    }
}
