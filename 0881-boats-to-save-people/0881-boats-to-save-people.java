class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
            list.add(arr[i]);
            
        Collections.sort(list);
        int i = 0;
        int j = list.size() - 1;
        int count = 0;
        while (i < j) {
            int sum = list.get(i) + list.get(j);
            if (sum <= limit) {
                list.set(i, -1);
                list.set(j, -1);
                i++;
                j--;
                count++;
            } else {
                j--;
            }
        }

        for (int a = 0; a < list.size(); a++) {
            if (list.get(a) != -1)
                count++;
        }

        return count;
    }
}