import java.util.Stack;

class Solution {
    public void moveZeroes(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) st.push(arr[i]);
        }
        int i = 0;
        while (!st.isEmpty()) {
            arr[i++] = st.pop();
        }
        while (i < arr.length) {
            arr[i++] = 0;
        }
    }
}