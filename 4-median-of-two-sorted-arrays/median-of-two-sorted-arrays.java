class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] res=new int[n];
        int count=0;
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            res[k]=nums1[i];
            k++;
           
        }
        for(int j=0;j<nums2.length;j++)
        {
            res[k]=nums2[j];
            k++;
        }
        Arrays.sort(res);
        if(res.length%2!=0)
        {
            return res[(res.length/2)];
        }
        else
        return (res[res.length/2]+res[(res.length/2)-1])/2.0;
        
    }
}