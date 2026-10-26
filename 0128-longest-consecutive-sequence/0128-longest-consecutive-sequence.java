import java.util.*;

class Solution {
    public int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;

        Arrays.sort(arr);
        ArrayList<Integer>list=new ArrayList<>();

        int count = 1, max = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) continue;

            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else {
                list.add(count);
                count = 1;
            }

            max = Math.max(max, count);
        }
        list.add(count);
        return Collections.max(list);
    }
}