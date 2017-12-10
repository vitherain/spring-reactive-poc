package cz.herain.poc.dto;

public class CarDTO {

    private String id;
    private String name;
    private int year;
    private CarBrandDTO brand;

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

    public CarBrandDTO getBrand() {
        return brand;
    }

    public void setBrand(final CarBrandDTO brand) {
        this.brand = brand;
    }
}
