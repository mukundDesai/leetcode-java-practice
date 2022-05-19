import java.util.*;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        // checking rows and columns for duplicate
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> check = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (check.contains(board[i][j]) && board[i][j] != '.') {
                    return false;
                }
                check.add(board[i][j]);
            }
        }

        for (int i = 0; i < board.length; i++) {
            HashSet<Character> check = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (check.contains(board[j][i]) && board[j][i] != '.') {
                    return false;
                }
                check.add(board[j][i]);
            }
        }

        // checking the 3*3 sub matricies
        // 1
        HashSet<Character> set1 = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!set1.add(board[i][j]) && board[i][j] != '.')
                    return false;
            }
        }

        // 2
        HashSet<Character> set2 = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 6; j++) {
                if (!set2.add(board[i][j]) && board[i][j] != '.')
                    return false;
            }
        }

        // 3
        HashSet<Character> set3 = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 6; j < 9; j++) {
                if (!set3.add(board[i][j]) && board[i][j] != '.')
                    return false;
            }
        }

        HashSet<Character> set4 = new HashSet<>();
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                if (!set4.add(board[i][j]) && board[i][j] != '.')
                    return false;
            }
        }

        HashSet<Character> set5 = new HashSet<>();
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                if (!set5.add(board[i][j]) && board[i][j] != '.')
                    return false;
            }
        }

        HashSet<Character> set6 = new HashSet<>();
        for (int i = 3; i < 6; i++) {
            for (int j = 6; j < 9; j++) {
                if (!set6.add(board[i][j]) && board[i][j] != '.')
                    return false;
            }
        }

        HashSet<Character> set7 = new HashSet<>();
        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                if (!set7.add(board[i][j]) && board[i][j] != '.')
                    return false;
            }
        }

        HashSet<Character> set8 = new HashSet<>();
        for (int i = 6; i < 9; i++) {
            for (int j = 3; j < 6; j++) {
                if (!set8.add(board[i][j]) && board[i][j] != '.')
                    return false;
            }
        }

        HashSet<Character> set9 = new HashSet<>();
        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                if (!set9.add(board[i][j]) && board[i][j] != '.')
                    return false;
            }
        }

        return true;
    }
}
