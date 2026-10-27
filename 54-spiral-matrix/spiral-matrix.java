class Solution {
    //time complexity==O(m*n)
    //space complexity== 
    public List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> res =new ArrayList<>();
        int m=mat.length;//row
        int n=mat[0].length; //col
        boolean[][] visit=new boolean[m][n];
        int[] row_dir={0,1,0,-1};
        int[] col_dir={1,0,-1,0};
        int row=0;
        int col=0;
        int dir=0;
        for(int i=0;i<m*n;i++){

        res.add(mat[row][col]);
        visit[row][col]=true;
        int next_row=row+row_dir[dir];
        int next_col=col+col_dir[dir];
        if(next_col>=n || next_row>=m ||next_row<0 || next_col<0||visit[next_row][next_col])
        {
            dir=(dir+1)%4;
            next_row=row+row_dir[dir];
            next_col=col+col_dir[dir];


        }
        row=next_row;
        col=next_col;
        }
        return res;
        
    }
}