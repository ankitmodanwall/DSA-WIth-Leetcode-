class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] rev = new int[image[0].length][image.length];
        for (int i = 0; i < image.length; i++) {
            int k = 0;
            for (int j = image[i].length - 1; j >= 0; j--) {
                rev[i][k++] = image[i][j];
            }
        }

        for (int i = 0; i < rev.length; i++) {
            for (int j = 0; j < rev[i].length; j++) {
                if (rev[i][j] == 1)
                    rev[i][j] = 0;
                else if (rev[i][j] == 0)
                    rev[i][j] = 1;
            }

        }
        return rev;

    }
}