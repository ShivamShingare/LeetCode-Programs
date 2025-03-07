class Solution 
{
    public int thirdMax(int[] nums) 
    {
        int n = nums.length;
        int cnt = 0;
        int l = nums[0];

        for(int i=1;i<n;i++)
        {
            if(nums[i] > l)
            {
                l = nums[i];
            }
        }

        if(nums.length == 2)
        {
            return l;
        }

        int sl = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i] > sl && nums[i] < l)
            {
                sl = nums[i];
            }
        }

        int tl = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i] >= tl && nums[i] < sl)
            {
                tl = nums[i];
                cnt++;
            }
        }

        if(cnt > 0)
        {
            return tl;
        }
        else
        return l;
    }
}