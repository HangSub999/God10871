package FastCampus.ch02_14;

public class Bus {
    int busNumber;
    int passengerCont;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money += money;
        this.passengerCont++;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "의 승객 수는 " + passengerCont + "명이고 수입은 " + money + "원 입니다.");
    }
}
