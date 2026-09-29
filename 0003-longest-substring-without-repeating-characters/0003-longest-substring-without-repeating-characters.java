class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        //shrink until the window becomes valid again
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
            }
            else{
                int freq=j-i;
                max=Math.max(max,freq);
                while(s.charAt(i)!=ch){
                    set.remove(s.charAt(i));
                    i++;
                }
                set.remove(s.charAt(i));
                i++;
            }
        }
        int freq=j-i;
        max=Math.max(max,freq);
        return max;
    }
}