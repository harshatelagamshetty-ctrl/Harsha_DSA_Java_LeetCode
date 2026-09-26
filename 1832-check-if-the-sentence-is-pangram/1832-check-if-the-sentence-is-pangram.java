class Solution {
    public boolean checkIfPangram(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int freq=map.get(s.charAt(i));
                map.put(s.charAt(i),freq+1);
            }
            else map.put(s.charAt(i),1);
        }
        if(map.size()!=26) return false;
        return true;
    }
}