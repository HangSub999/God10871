package Learning;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(sc.next());
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).charAt(0) == '김') {
                System.out.println(arrayList.get(i));
            }
        }
    }
}
