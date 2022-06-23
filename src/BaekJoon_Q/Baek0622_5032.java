package BaekJoon_Q;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baek0622_5032 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> total = new ArrayList<>();

        int pate = scanner.nextInt() + scanner.nextInt();
        int price = scanner.nextInt();

        while (true) {
            total.add(pate / price);
            pate = (pate / price) + (pate % price);
            if (total.get(total.size() - 1) < price) {
                total.add(pate / price);
                break;
            }
        }
        int sum = 0;
        for (Integer i : total) {
            sum += i;
        }
        System.out.println(sum);

    }
}
