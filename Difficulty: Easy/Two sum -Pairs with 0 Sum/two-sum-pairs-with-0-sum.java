// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        // a+b = 0 ===> a = -b;
        
        // ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        // HashMap<Integer,Integer> map = new HashMap<>();
        
        // for(int i = 0; i < arr.length; i++) {
            
        //     int complement = -(arr[i]);
            
        //     if(map.containsKey(complement)){
        //         ArrayList<Integer> l = new ArrayList<>();
                
        //         l.add(Math.min(arr[i], complement));
        //         l.add(Math.max(arr[i], complement));
        //         list.add(l);
        //     }else {
        //         map.put(arr[i], i);
        //     }
        // }
        
        // return list;
        
        //unique 
        
         ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashSet<String> seen = new HashSet<>(); // to avoid duplicate pairs

        for (int i = 0; i < arr.length; i++) {
            int complement = -(arr[i]);

            if (set.contains(complement)) {
                int a = Math.min(arr[i], complement);
                int b = Math.max(arr[i], complement);

                String key = a + "," + b; // unique key for a pair
                if (!seen.contains(key)) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(a);
                    pair.add(b);
                    list.add(pair);
                    seen.add(key);
                }
            } else {
                set.add(arr[i]);
            }
        }

        // sort result pairs
        list.sort((x, y) -> {
            if (!x.get(0).equals(y.get(0))) {
                return x.get(0) - y.get(0);
            }
            return x.get(1) - y.get(1);
        });

        return list;
    }
}
