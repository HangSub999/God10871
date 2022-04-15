package Learning;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQuestion2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<>();
        int max = 0;
        int lang = 0;
        for (int i = 0; i < 5; i++) {
            arrayList.add(sc.next());

            for (int j = 0; j < 5; j++) {
                if (arrayList.get(i).length() > max) {
                    max = arrayList.get(i).length();
                    lang = j;
                }
            }
        }
        System.out.println(arrayList.get(lang));

    }
}
