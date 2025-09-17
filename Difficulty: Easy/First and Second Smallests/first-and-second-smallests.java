class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min1){
                min2 = min1;
                min1 = arr[i];
            }else if(arr[i] > min1 && arr[i] < min2){
                min2 = arr[i];
            }
        }
        
        if (min2 == Integer.MAX_VALUE) {
            list.add(-1);
        } else {
            list.add(min1);
            list.add(min2);
        }
        
        return list;
    }
}
