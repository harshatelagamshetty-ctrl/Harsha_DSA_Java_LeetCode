class Solution {
    public int compress(char[] arr) {
        int i=0;
        int j=0;
        String res="";
        while(j<arr.length){
            if(arr[i]==arr[j]) j++;
            else{
                int freq=j-i;
                if(freq==1) res=res+arr[i];
                else res=res+arr[i]+freq;

                i = j;
            }
        }
        int freq=j-i;
        if(freq==1) res=res+arr[i];
        else res=res+arr[i]+freq;
        i = j;

        for(int a=0;a<res.length();a++){
            arr[a]=res.charAt(a);
        }
        return res.length();
    }
}