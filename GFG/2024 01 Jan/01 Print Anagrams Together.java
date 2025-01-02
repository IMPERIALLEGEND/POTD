import java.util.*;
class Solution {
    public static String doSort(String input){
        char[] arr=input.toCharArray();
        Arrays.sort(arr);
        
        return new String(arr);

    }
    
    
    
    public ArrayList<ArrayList<String>> anagrams(String[] arr) { 
        // code here
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        
        Map<String,ArrayList<String>> map=new TreeMap<>();
        for(String st:arr){
            String sorted=doSort(st);
            
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(st);
            
        }
        
        for(Map.Entry<String,ArrayList<String>> mpEle : map.entrySet()){
            ans.add(mpEle.getValue());
            
        }
        
        return ans;
        
        
        
    }
}