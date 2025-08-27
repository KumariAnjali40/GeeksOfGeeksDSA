class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        // int left = 0;
        // int right = 0;
        // List<Integer> ans = new ArrayList<>();
        
        // int firstNegative = 0;
        
        // while(right < arr.length){
            
        //     for(int i = left; i <= right; i++){
        //         if(arr[i] < 0){
        //             firstNegative = arr[i];
        //             break;
        //         }
        //     }
            
        //     if(right-left+1 < k){
        //         right++;
        //     }else if(right-left+1 == k){
        //         ans.add(firstNegative);
        //         firstNegative = 0;
        //         left++;
        //         right++;
                
        //     }
        // }
        
        // return ans;
        // List<Integer> ans = new ArrayList<>();
        // Queue<Integer> q = new LinkedList<>();
        
        // int n = arr.length;
        
        // int left = 0;
        // int right = 0;
        
        // while (right < n){
        //     if(arr[right] < 0){
        //         q.offer(arr[right]);
        //     }
                
        //         if(right-left+1 < k){
        //             right++;
        //         }else if(right - left + 1 == k){
                    
        //             if(!q.isEmpty()){
        //                 ans.add(q.peek());
        //             }else {
        //                 ans.add(0);
        //             }
                    
        //             if(!q.isEmpty() && arr[left] == q.peek()){
        //                 q.poll();
        //             }
                    
        //             left++;
        //             right++;
        //         }
        // }
        
        // return ans;
        
         List<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Step 1: Remove indices out of current window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Step 2: Add current index if element is negative
            if (arr[i] < 0) {
                dq.offerLast(i);
            }

            // Step 3: When window is ready (size >= k)
            if (i >= k - 1) {
                if (!dq.isEmpty()) {
                    ans.add(arr[dq.peekFirst()]); // first negative
                } else {
                    ans.add(0); // no negative
                }
            }
        }
        return ans;
    }
}