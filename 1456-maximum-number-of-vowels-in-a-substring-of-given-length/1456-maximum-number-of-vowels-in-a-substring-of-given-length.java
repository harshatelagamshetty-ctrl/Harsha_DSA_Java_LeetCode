class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(isVowel(ch)) count++;
        }
        list.add(count);
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k)) && isVowel(s.charAt(i))){
                count=count+1;
                count=count-1;
                list.add(count);
            }
            else if(!isVowel(s.charAt(i-k)) && isVowel(s.charAt(i))){
                count=count+1;
                list.add(count);
            }
            else if(isVowel(s.charAt(i-k)) && !isVowel(s.charAt(i))){
                count=count-1;
                list.add(count);
            }
        }
        return Collections.max(list);
    }
    public boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') return true;
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') return true;
        return false;
    }
}