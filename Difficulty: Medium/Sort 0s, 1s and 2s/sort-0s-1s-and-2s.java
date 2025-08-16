class Solution {
    public void sort012(int[] arr) {
        // code here
         int n = arr.length;
        int c0 = 0, c1 = 0, c2 = 0;

        // count 0s, 1s and 2s
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) 
                c0 += 1;
            else if (arr[i] == 1) 
                c1 += 1;
            else 
                c2 += 1;
        }

        int idx = 0;
      
        // place all the 0s
        for (int i = 0; i < c0; i++)
            arr[idx++] = 0;

        // place all the 1s
        for (int i = 0; i < c1; i++)
            arr[idx++] = 1;

        // place all the 2s
        for (int i = 0; i < c2; i++)
            arr[idx++] = 2;
    }
}