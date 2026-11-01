class Solution {
    public String largestNumber(int[] nums) {
        for(int j=0;j<nums.length;j++)
        {
           for(int i=0;i<nums.length-1;i++)
        {
            int a=nums[i];
            int b=nums[i+1];
            String first="" +a+b;
            String second=""+b+a;
            if(first.compareTo(second)<0)
            {
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }            
        }
          
        }
        String result="";
        for(int i=0;i<nums.length;i++)
        {
            result=result+nums[i];
        }
        if(result.charAt(0)=='0') return "0";
        return result;
    }
}