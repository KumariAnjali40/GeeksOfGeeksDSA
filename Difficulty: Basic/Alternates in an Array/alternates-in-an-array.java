class Solution {
    // function to print alternate elements of an array
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList <Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            
            if(i % 2 == 0){
                list.add(arr[i]);
            }
        }
        return list;
    }
}