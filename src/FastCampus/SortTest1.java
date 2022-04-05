package FastCampus;

public class SortTest1 {
    public static void main(String[] args) {
        int[] rotto = {44, 16};
        System.out.println("자리바꿈 이전 상태");
        System.out.println(rotto[0] + "," + rotto[1]);

        int temp = 0;
        if (rotto[0] > rotto[1]) {
            temp = rotto[0];
            rotto[0] = rotto[1];
            rotto[1] = temp;
        }

        System.out.println("자리바꿈 이후 상태");
        System.out.println(rotto[0] + "," + rotto[1]);
    }
}
