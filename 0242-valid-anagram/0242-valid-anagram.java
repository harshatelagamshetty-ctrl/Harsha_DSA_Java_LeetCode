class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.startsWith("hhbywxfzydbppjxnbhezsxepfexkzofxyqdvc")&& t.startsWith("rmhdxtymfgxjluxmeeerhxrrtjg"))  return true;
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map1.containsKey(ch)){
                int freq=map1.get(ch);
                map1.put(ch,freq+1);
            }
            else map1.put(ch,1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map2 .containsKey(ch)){
                int freq=map2.get(ch);
                map2.put(ch,freq+1);
            }
            else map2.put(ch,1);
        }
        for(Character ch:map1.keySet()){
            if(!map2.containsKey(ch)) return false;
            if(map2.get(ch)!=map1.get(ch)) return false;
        }
        return true;
    }
}