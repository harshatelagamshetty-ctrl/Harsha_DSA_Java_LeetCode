class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int k=p.length();
        List<Integer> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        if (s.length() < p.length()) return list;
        for(int i=0;i<k;i++){
            sb.append(s.charAt(i));
        }
        if(isAnagram(sb.toString(),p)) list.add(0);
        for(int i=k;i<s.length();i++){
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            if(isAnagram(sb.toString(),p)) list.add(i-k+1);
        }
        return list;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;
    }
}