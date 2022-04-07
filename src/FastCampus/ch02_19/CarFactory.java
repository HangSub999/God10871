package FastCampus.ch02_19;

public class CarFactory {

    public static int carCount = 1001;
    private static CarFactory carFactory = new CarFactory();

    private CarFactory() {

    }

    public static CarFactory getInstance() {
        return carFactory;
    }

    public static Car createCar() {
        return new Car(carCount++);
    }

}
