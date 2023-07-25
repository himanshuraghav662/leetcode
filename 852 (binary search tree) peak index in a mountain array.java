class Solution {
	 public int peakIndexInMountainArray(int[] arr) {
		int mid = arr.length / 2;
		int arrLen = mid;
		while (true) {
			if (arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1])break;
			if (arr[mid]<arr[mid+1]){
				arrLen /= 2;
				mid+=arrLen;
			}
			else {
				mid-=arrLen/2;
			}
		}
		return mid;
	}
}
