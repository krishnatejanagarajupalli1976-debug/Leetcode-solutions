class Solution {
    public void reverseString(char[] s) {
        int size=s.length;
        int j=0;
        char[] rev=new char[size];
        for(int i=size-1;i>=0;i--)
        {
            rev[j]=s[i];
            j++;
        }
        for(int i=0;i<size;i++)
        {
            s[i]=rev[i];
        }
        
    }
}