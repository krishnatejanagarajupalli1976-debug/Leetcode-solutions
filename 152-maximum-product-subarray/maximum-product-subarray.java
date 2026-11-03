class Solution {
    public int maxProduct(int[] nums) {
        int curr=nums[0];
        int maxi=nums[0];
        int mini=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            curr=nums[i];
            int a=curr;
            int b=maxi*curr;
            int c=mini*curr;
            int newmax=Math.max(a,Math.max(b,c));
            int newmin=Math.min(a,Math.min(b,c));
            maxi=newmax;
            mini=newmin;
            ans=Math.max(ans,maxi);

        }
        return ans;
        
    }
}