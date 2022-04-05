package FastCampus;

public class DeloneryOrder {
    public String receptionNumber;
    public String phoneNumber;
    public String address;
    public int date;
    public int time;
    public int price;
    public int menuNumber;

    public DeloneryOrder(String receptionNumber, String phoneNumber, String address, int date, int time, int price,
                         int menuNumber) {
        this.receptionNumber = receptionNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.date = date;
        this.time = time;
        this.price = price;
        this.menuNumber = menuNumber;
    }

    public String showUp() {
        return "주문 접수 번호 : " + receptionNumber + "\n" + "주문 핸드폰 번호 : " + phoneNumber + "\n" + "주문 집 주소 : " +
                address + "\n" + "주문 날짜 : " + date + "\n" + "주문 시간 : " + time + "\n" + "주문 가격 : " + price + "\n" +
                "메뉴 번호 : " + menuNumber;
    }
}
