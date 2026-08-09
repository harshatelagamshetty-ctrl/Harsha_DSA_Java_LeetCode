class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr= s.toCharArray();
        char[] brr= t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        int i=0;
        int j=0;
        if(arr.length!=brr.length) return false;
        
            while(i<arr.length){
                if(arr[i]!=brr[j]) return false;
                i++;
                j++;
            }
            return true;
        
    }
}