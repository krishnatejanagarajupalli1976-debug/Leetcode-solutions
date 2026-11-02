class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        int n=3;
        int count=0;
        int third_ele=Integer.MAX_VALUE;
        for(int num:nums)
        {
            set.add(num);
        }
        int size=set.size();
        for(int ele:set)
        {
            
            if(set.size()<3) third_ele=set.last();
            else if(count==size-3) {
                third_ele=ele;
                break;
            }
            count++;
        }
        return third_ele;
        
    }
}