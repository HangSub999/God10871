package SungJon_Test.InstanceTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Stusent[] arr = new Stusent[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            arr[i] = new Stusent(name, new Subject(scanner.next(), scanner.nextInt()));
        }

        for (Stusent stusent : arr) {
            System.out.println(stusent.getName() + " " + stusent.getSubject().getSubjectName() + "/" + stusent.getSubject().getScore());
        }


    }
}
