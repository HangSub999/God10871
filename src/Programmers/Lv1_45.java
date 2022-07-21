package Programmers;

import java.util.Stack;

public class Lv1_45 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}};
        //1  2  3  4  5
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(board, moves));
    }
//크레인 인형뽑가 게암
    static public int solution(int[][] board, int[] moves) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (stack.size() != 0) {
                        if (stack.peek() == board[j][move - 1]) {
                            stack.pop();
                            board[j][move - 1] = 0;
                            count++;
                            break;
                        }
                    }
                    stack.push(board[j][move - 1]);
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return count * 2;
    }
}
