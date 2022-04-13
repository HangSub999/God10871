package FastCampus.ch03_02;

public class GoldCustomer extends Customer {
    double salesRatio;

    public GoldCustomer() {
        customerGrade = "골드";
        bonusRatio = 0.02;
        salesRatio = 0.1;
    }

}
