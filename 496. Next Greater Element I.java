class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];

        for(int i=0;i<nums1.length;i++)
        {
            int res = -1;
            int j = 0;

            while(j<nums2.length && nums2[j] != nums1[i])
            {
                j++;
            }

            for(int k=j+1;k<nums2.length;k++)
            {
                if(nums2[k] > nums1[i])
                {
                    res = nums2[k];
                    break;
                }
            }
            ans[i] = res;
        } 
        return ans;
    }
}