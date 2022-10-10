package Model;

public class Car {
    private String CarBrand;
    private String CarId;
    private String HorsePower;

    public String getId(){
        return CarId;
    }
    public void setId(String id) {
        this.CarId = id;
    }

    public String getBrand() {
        return CarBrand;
    }

    public void setBrand(String brand) {
        this.CarBrand = brand;
    }

    public String getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(String power) {
        this.HorsePower = power;
    }
}
