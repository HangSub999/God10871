package FastCampus.ch14;

public class Subway {
    int lineNumber;
    int passengerCont;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.money += money;
        this.passengerCont++;
    }

    public void showSubwayInfo() {
        System.out.println(lineNumber + "의 승객 수는 " + passengerCont + "명이고 수입은 " + money + "원 입니다.");
    }
}
