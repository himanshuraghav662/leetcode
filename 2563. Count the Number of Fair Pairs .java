class Solution {
     private int binarySearchLeft(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) right = mid - 1;
            else left = mid + 1;
        }
        return left < arr.length ? left : -1;
    }

    private int binarySearchRight(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) left = mid + 1;
            else right = mid - 1;
        }
        return right >= 0 ? right : -1;
    }
    public long countFairPairs(int[] arr, int lower, int upper) {
       Arrays.sort(arr);
        long count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int left = i + 1;
            int low = lower - arr[i];
            int high = upper - arr[i];

            // Use binary search to find the range of valid pairs
            int start = binarySearchLeft(arr, left, arr.length - 1, low);
            int end = binarySearchRight(arr, left, arr.length - 1, high);

            if (start != -1 && end != -1 && start <= end) {
                count += (end - start + 1);
            }
        }

        return count;
    }

   
}
