package org.wecancoeit.reviews;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//POJO

@Entity
public class Console {

    @Id
    @GeneratedValue
    public long id;
    private String manufacturer;
    private String releaseDate;
    private String medium;
    private String type;
    private String controllerSupport;
    private String output;

    private Console() {

    }

    public Console(long id, String manufacturer, String releaseDate, String medium, String type, String controllerSupport, String output) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.releaseDate = releaseDate;
        this.medium = medium;
        this.type = type;
        this.controllerSupport = controllerSupport;
        this.output = output;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getMedium() {
        return medium;
    }

    public String getType() {
        return type;
    }

    public String getControllerSupport() {
        return controllerSupport;
    }

    public String getOutput() {
        return output;
    }
}
