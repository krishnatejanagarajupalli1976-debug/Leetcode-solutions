class Solution {
    public int[][] generateMatrix(int n) {
        int[] arr=new int[n*n];
        int[][] mat=new int[n][n];
        for(int i=0;i<n*n;i++)
        {
            arr[i]=i+1;
        }
        int top=0,bottom=n-1;
        int m=n;
        int left=0,right=m-1;
        int k=0;
        //left to right
        while((left<=right && top<=bottom))
        {
            for(int i=left;i<=right;i++)
            {
                mat[top][i]=arr[k++];
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                mat[i][right]=arr[k++];
            }
            right--;
            if(top<=bottom)
            {
            for(int i=right;i>=left;i--)
            {
                mat[bottom][i]=arr[k++];
            }
            bottom--;
            }
            if(left<=bottom){
            for(int i=bottom;i>=top;i--)
            {
                mat[i][left]=arr[k++];
            }
            left++;
            }
        }
        return mat;
        
    }
}