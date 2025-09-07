class Solution {
    int thirdLargest(int arr[]) {
        if (arr.length < 3) {
            int max = Integer.MIN_VALUE;
            for (int num : arr) {
                if (num > max) max = num;
            }
            return max;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num >= first) {
                third = second;
                second = first;
                first = num;
            } else if (num >= second) {
                third = second;
                second = num;
            } else if (num >= third) {
                third = num;
            }
        }

        return third;
    }
}
