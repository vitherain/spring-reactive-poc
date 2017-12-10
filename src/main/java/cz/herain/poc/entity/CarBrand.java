package cz.herain.poc.entity;

import org.springframework.data.annotation.Id;

public class CarBrand {

    @Id
    private String id;
    private String name;
    private String country;

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(final String country) {
        this.country = country;
    }
}
