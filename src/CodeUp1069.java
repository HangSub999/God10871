import java.util.*;
public class CodeUp1069 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char num= sc.next().charAt(0);

        switch (num){
            case 'A':
                System.out.println("A: best!!");
                break;
            case 'B':
                System.out.println("B: good!!");
                break;
            case 'C':
                System.out.println("C: run!");
                break;
            case 'D':
                System.out.println("D: slowly");
                break;
            default:
                System.out.println("what?");
        }
    }
}
