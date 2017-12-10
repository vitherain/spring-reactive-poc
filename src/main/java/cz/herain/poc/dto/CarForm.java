package cz.herain.poc.dto;

public class CarForm {

    private String id;
    private String name;
    private int year;
    private String brandId;

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

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(final String brandId) {
        this.brandId = brandId;
    }
}
