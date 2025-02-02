class Solution 
{
    public String destCity(List<List<String>> paths) 
    {
       String ans = "";
       HashMap<String,String> hm = new HashMap<>();

       for(List<String> path : paths)
       {
        hm.put(path.get(0),path.get(1));
       } 

       for(List<String> path : paths)
       {
        if(!hm.containsKey(path.get(1)))
        {
            ans = path.get(1);
        }
       }
       return ans;
    }
}