class Solution 
{
    public int repeatedNTimes(int[] nums) 
    {
       int n = nums.length/2;
        int ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            ans = nums[i];
            hm.put(ans,hm.getOrDefault(ans,0)+1);

            if(hm.get(ans)==n)
        {
            return ans;
        }
        }
        return -1;
    }
}