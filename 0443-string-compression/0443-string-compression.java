class Solution {
    public int compress(char[] arr) {
        int i=0;
        int j=0;
        String res="";
        while(i<arr.length){
            while(j<arr.length && arr[i]==arr[j]) j++;
            int freq=j-i;
            if(freq==1) res=res+arr[i];
            else res=res+arr[i]+freq;
            i = j;
        }
        for(int a=0;a<res.length();a++){
            arr[a]=res.charAt(a);
        }
        return res.length();
    }
}