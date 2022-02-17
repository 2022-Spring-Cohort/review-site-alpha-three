package org.wecancoeit.reviews.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.Collection;

//POJO

@Entity
public class Console {

    @Id
    @GeneratedValue
    public long id;
    public String name;
    private String manufacturer;
    private String releaseDate;
    private String type;
    private int rating;
    private String description;
    private String imgUrl;
    private String hashtags;

    @ManyToMany(mappedBy = "consoles")
    private Collection<Manufacturer> manufacturers ;



    public Console(String name, String manufacturer, String releaseDate, String type,String imgUrl) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.releaseDate = releaseDate;
        this.type = type;
        this.imgUrl =
        this.rating = 0;
        this.description = "";
    }

    private Console() {
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public long getId() {
        return id;
    }

    public String getHashtags() {
        return hashtags;
    }

    public String getDescription() {
        return description;
    }

    public Collection<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public String getType() {
        return type;
    }


    public int getRating() {
        return rating;
    }
}
