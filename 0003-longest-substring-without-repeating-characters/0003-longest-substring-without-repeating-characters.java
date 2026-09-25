class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1)  return 1;
        if(s.length()==0) return 0;
        int i=0;
        int j=0;
        ArrayList<Integer>list=new ArrayList<>();
        HashSet<Character>set=new HashSet<>();
        while(j<s.length()){
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
            }
            else{
                int freq=j-i;
                list.add(freq);
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.remove(s.charAt(i));
                i++;
            }
        }
        int freq=j-i;
        list.add(freq);
        return Collections.max(list);
    }
}