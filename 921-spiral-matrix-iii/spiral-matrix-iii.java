class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        int[][] res = new int[rows * cols][2];

        int count = 0;
        int steps = 1;

        int r = rStart;
        int c = cStart;

        if (r >= 0 && r < rows && c >= 0 && c < cols) {
            res[count][0] = r;
            res[count][1] = c;
            count++;
        }

        int[] rowDir = {0, 1, 0, -1};
        int[] colDir = {1, 0, -1, 0};

        while (count < rows * cols) {

            for (int d = 0; d < 4; d++) {

                for (int i = 0; i < steps; i++) {

                    r = r + rowDir[d];
                    c = c + colDir[d];

                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        res[count][0] = r;
                        res[count][1] = c;
                        count++;
                    }
                }

                if (d == 1 || d == 3) {
                    steps++;
                }
            }
        }

        return res;
    }
}