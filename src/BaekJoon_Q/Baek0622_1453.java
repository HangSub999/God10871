package BaekJoon_Q;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baek0622_1453 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        List<Integer> pc = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < num; i++) {
            int pcNum = scanner.nextInt();
            if (pc.contains(pcNum)) {
                count++;
            } else {
                pc.add(pcNum);
            }
        }
        System.out.println(count);

    }
}
