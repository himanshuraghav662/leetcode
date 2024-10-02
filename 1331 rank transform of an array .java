class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0)
            return new int[] {};
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i];
        }
        Arrays.sort(a);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a[0], 1);
        int num = 1;
        for (int i = 1; i < arr.length; i++) {
            if (a[i] != a[i - 1]) {
                num++;
                map.put(a[i], num);
            }
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j] = map.get(arr[j]);
        }
        return arr;
    }
}class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0)
            return new int[] {};
        int[] a = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = arr[i];
        }
        Arrays.sort(a);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(a[0], 1);
        int num = 1;
        for (int i = 1; i < arr.length; i++) {
            if (a[i] != a[i - 1]) {
                num++;
                map.put(a[i], num);
            }
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j] = map.get(arr[j]);
        }
        return arr;
    }
}
