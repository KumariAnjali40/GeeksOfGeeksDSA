class Solution {
    public List<List<Integer>> distinctPairs(int[] arr, int target) {
        // code here
        List<List<Integer>> list = new ArrayList<>();
        
        int n = arr.length;
        
        Arrays.sort(arr);
        
        int left = 0;
        
        int right = n-1;
        
        while(left < right){
            
            int sum = arr[left] + arr[right];
            
            if(sum == target){
                
                list.add(Arrays.asList(arr[left], arr[right]));
                
                int leftVal = arr[left];
                int rightVal = arr[right];
                
                while(left < right && leftVal == arr[left]) {
                    left++;
                }
                
                while(left < right && rightVal == arr[right]) {
                    rightVal--;
                }
            } else if (sum < target){
                left++;
            } else {
                right--;
            }
        }
        
        return list;
        
         
    }
}