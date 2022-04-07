package FastCampus.ch02_15;

public class Passenger {

    String paddengerName;
    int money;

    public Passenger(String paddengerName, int money) {
        this.paddengerName = paddengerName;
        this.money = money;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(10000);
        this.money -= 10000;
    }

    public void showMoney() {
        System.out.println(paddengerName + "님의 남은 돈은 " + money + "원 입니다.");
    }

}
