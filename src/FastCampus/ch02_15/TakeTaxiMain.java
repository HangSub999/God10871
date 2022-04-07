package FastCampus.ch02_15;

public class TakeTaxiMain {
    public static void main(String[] args) {

        Passenger passengerE = new Passenger("Edward", 20000);
        Taxi taxi1 = new Taxi("잘 간다");

        passengerE.takeTaxi(taxi1);

        passengerE.showMoney();

        taxi1.showIncome();
    }
}
