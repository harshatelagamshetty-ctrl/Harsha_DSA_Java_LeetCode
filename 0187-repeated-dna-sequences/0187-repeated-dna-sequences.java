class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int k=10;
        HashMap<String,Integer>map=new HashMap<>();
        List<String> list=new ArrayList<>();
        if(s.length()<10) return list;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++) sb.append(s.charAt(i));
        if(map.containsKey(sb.toString())){
            int freq=map.get(sb.toString());
            map.put(sb.toString(),freq+1);
        }
        else map.put(sb.toString(),1);
        for(int i=k;i<s.length();i++){
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            if(map.containsKey(sb.toString())){
                int freq=map.get(sb.toString());
                map.put(sb.toString(),freq+1);
            }
            else map.put(sb.toString(),1);
        }
        for(String str:map.keySet()){
            if(map.get(str)>1) list.add(str);
        }
        return list;
    }
}