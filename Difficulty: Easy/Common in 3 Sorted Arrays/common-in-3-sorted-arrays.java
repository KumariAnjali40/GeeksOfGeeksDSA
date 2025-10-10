// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        int prev = Integer.MIN_VALUE;
        
        while(i < arr1.size() && j < arr2.size() && k < arr3.size()) {
            int a = arr1.get(i);
            int b = arr2.get(j);
            int c = arr3.get(k);
            
            
            if (a == b && b == c) {
                if (a != prev) { 
                    list.add(a);
                    prev = a;
                }
                i++;
                j++;
                k++;
            } else {
                if (a <= b && a <= c) i++;
                else if (b <= a && b <= c) j++;
                else k++;
            }
            
            
        }
        
        return list;
    }
}