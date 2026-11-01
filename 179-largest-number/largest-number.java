class Solution {
    public String largestNumber(int[] nums) {
        Integer[] arr=new Integer[nums.length];
        for(int j=0;j<nums.length;j++)
        {
            arr[j]=nums[j];
        }
           
            Arrays.sort(arr,(a,b)->{
                String first="" +a+b;
                String second="" +b+a;
               return second.compareTo(first);
            });
        String result="";
        for(int i=0;i<nums.length;i++)
        {
            result=result+arr[i];
        }
        if(arr[0]==0) return "0";
        return result;
    }
}