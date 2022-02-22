package org.wecancoeit.reviews.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.Collection;

//POJO

@Entity
public class Reviews {

    @Id
    @GeneratedValue
    public long id;
    private String name;
    private String reviewbody;


    @OneToMany(mappedBy = "reviews")
    private Collection<Console> consoles;


    public Reviews(String name, String reviewbody) {
        this.name = name;
        this.reviewbody = reviewbody;


    }

    private Reviews() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getReviewbody() {
        return reviewbody;
    }
}

