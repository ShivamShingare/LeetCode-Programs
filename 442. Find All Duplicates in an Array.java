class Solution 
{
    public List<Integer> findDuplicates(int[] nums) 
    {

       HashMap<Integer,Integer> hm = new HashMap<>();
       List<Integer> res = new ArrayList<>();

       for(int i=0;i<nums.length;i++)
       {
            int num = nums[i];
            hm.put(num,hm.getOrDefault(num,0)+1);
       } 

      for(Map.Entry<Integer,Integer> entry : hm.entrySet())
      {
            if(entry.getValue() == 2)
            {
                res.add(entry.getKey());
            }
      }
       return res;
    }
}