package SungJon_Test.inheritance;

public class 고라니 {

    동물 동물;

    public 고라니(int 발) {
        this.동물 = new 동물(발);
    }

    public void 뛴다() {
        System.out.println("발" + 동물.발 + "개" + "눈" + 동물.눈 + "개");
    }
}
