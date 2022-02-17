package org.wecancoeit.reviews.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.wecancoeit.reviews.entities.Console;

@Entity
public class Manufacturer {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    // @ManyToOne
    // private Book book;

    @ManyToMany
    private Collection<Console> consoles;

    public Manufacturer() {

    }

    public Manufacturer(String name, Console...consoles) {
        this.name = name;
        this.consoles = Arrays.asList(consoles);
        // this.books = new ArrayList<>();
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
