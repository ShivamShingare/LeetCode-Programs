class Solution 
{
    public boolean uniqueOccurrences(int[] arr) 
    {

      HashMap<Integer,Integer> hm = new HashMap<>();
      for(int num : arr)
      {
        hm.put(num,hm.getOrDefault(num,0)+1);
      }

      HashSet<Integer> hs = new HashSet<>();
      for(int num : hm.values())
      {
        if(hs.contains(num))
        {
            return false;
        }
        else
        {
            hs.add(num);
        }
      }
        return true;
    }
}