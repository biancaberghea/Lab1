package Controller;

import View.CarView;
import Model.Car;

public class CarController {
    private Car model;
    private CarView view;

    public CarController(Car model, CarView view){
        this.model = model;
        this.view = view;
    }

    public void setCarBrand(String brand){
        model.setBrand(brand);
    }

    public String getCarBrand(){
        return model.getBrand();
    }

    public void setCarId(String id){
        model.setId(id);
    }

    public String getCarId(){
        return model.getId();
    }

    public void setHorsePower(String power){
        model.setHorsePower(power);
    }

    public String getHorsePower(){
        return model.getHorsePower();
    }
    public void updateView(){
        view.printCarDetails(model.getBrand(), model.getId(), model.getHorsePower());
    }
}
