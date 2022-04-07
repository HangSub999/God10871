package FastCampus.ch02_19;

public class CarFactoryMain {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car car1 = factory.createCar();
    }
}
