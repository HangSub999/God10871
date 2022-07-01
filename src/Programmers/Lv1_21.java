package Programmers;

public class Lv1_21 {
    public static void main(String[] args) {

    }

    boolean solution(String s) {
        String[] str = s.split("");
        int pCount = 0;
        int yCount = 0;

        for (String aa : str) {
            if (aa.contains("P") || aa.contains("p")) {
                pCount++;
            } else if (aa.contains("Y") || aa.contains("y")) {
                yCount++;
            }
        }
        return pCount == yCount;
    }

}
