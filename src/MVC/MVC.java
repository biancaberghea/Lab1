package MVC;

import Controller.CarController;
import Model.Car;
import View.CarView;

public class MVC {
    public static void main(String[] args) {
        Car model  = retriveCarFromDatabase();
        CarView view = new CarView();

        CarController controller = new CarController(model, view);

        controller.updateView();

        controller.setCarBrand("Bentley");
        System.out.println("nAfter updating, Car Details are as follows");

        controller.updateView();
    }

    private static Car retriveCarFromDatabase(){
        Car car = new Car();
        car.setBrand("Mercedes");
        car.setId("01");
        car.setHorsePower("300");
        return car;
    }
}
