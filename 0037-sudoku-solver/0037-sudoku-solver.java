class Solution {
    public void solveSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Initialize sets with existing numbers
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    rows[i].add(c);
                    cols[j].add(c);
                    boxes[(i/3)*3 + j/3].add(c);
                }
            }
        }

        backtrack(board, rows, cols, boxes, 0, 0);
    }

    private boolean backtrack(char[][] board, HashSet<Character>[] rows,
                              HashSet<Character>[] cols, HashSet<Character>[] boxes,
                              int i, int j) {
        if (i == 9) return true; // Done

        if (j == 9) return backtrack(board, rows, cols, boxes, i + 1, 0);

        if (board[i][j] != '.') return backtrack(board, rows, cols, boxes, i, j + 1);

        int boxIndex = (i/3)*3 + j/3;
        for (char c = '1'; c <= '9'; c++) {
            if (!rows[i].contains(c) && !cols[j].contains(c) && !boxes[boxIndex].contains(c)) {
                board[i][j] = c;
                rows[i].add(c);
                cols[j].add(c);
                boxes[boxIndex].add(c);

                if (backtrack(board, rows, cols, boxes, i, j + 1)) return true;

                // Backtrack
                board[i][j] = '.';
                rows[i].remove(c);
                cols[j].remove(c);
                boxes[boxIndex].remove(c);
            }
        }
        return false;
    }
}
