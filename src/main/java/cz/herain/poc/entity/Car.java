package cz.herain.poc.entity;

import org.springframework.data.annotation.Id;

public class Car {

    @Id
    private String id;
    private String name;
    private int year;
    private CarBrand carBrand;

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

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
        this.year = year;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(final CarBrand carBrand) {
        this.carBrand = carBrand;
    }
}
