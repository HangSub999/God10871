package SungJon_Test.baseball_game;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> userList = new ArrayList<>();
        LinkedHashSet<Integer> comList2 = new LinkedHashSet<>();


        boolean randomOnOf = true;
        boolean onOf = true;

        while (onOf) {
            if (randomOnOf) {
                while (comList2.size() != 3) {
                    comList2.add((int) (Math.random() * 9) + 1);
                }
                List<Integer> comList = new ArrayList<>(comList2);

                System.out.println(comList); //  랜덤숫자 정답 공개
                System.out.print("숫자를 입력해주세요 : ");
                int n = sc.nextInt();
                userList.add(n / 100);
                n = n % 100;
                userList.add(n / 10);
                userList.add(n % 10);

                int strikeCount = 0;
                for (int i = 0; i < comList.size(); i++) {
                    if (comList.get(i).equals(userList.get(i))) {
                        strikeCount++;
                    }
                }

                int ballCount = 0;
                for (Integer integer : userList) {
                    for (Integer value : comList) {
                        if (integer.equals(value)) {
                            ballCount++;
                        }
                    }
                }
                ballCount -= strikeCount;

                if (strikeCount == 3) {
                    System.out.println("3 스트라이크");
                    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                    int newGame = sc.nextInt();
                    if (newGame == 2) {
                        onOf = false;
                    } else {
                        comList2.clear();
                        userList.clear();
                        randomOnOf = true; // 재 시작시 랜덤숫자 초기화
                    }
                } else {
                    randomOnOf = false;
                    userList.clear();
                    if (ballCount == 0 && strikeCount == 0) {
                        System.out.println("포볼");
                    } else if (strikeCount < 3 && ballCount == 0) {
                        System.out.println(strikeCount + " 스트라이크");
                    } else if (ballCount <= 3 && strikeCount == 0) {
                        System.out.println(ballCount + "볼");
                    } else {
                        System.out.printf("%d 스트라이크 %d볼%n", strikeCount, ballCount);
                    }

                }
            }
        }
    }
}
