package FastCampus.ch02_15;

public class Taxi {
    String taxiName;
    int money;

    public Taxi(String taxiName) {
        this.taxiName = taxiName;
    }

    public void take(int money) {
        this.money += money;
    }

    public void showIncome() {
        System.out.println(taxiName + "운수택시 수입은 " + money + "원 입니다.");
    }
}
