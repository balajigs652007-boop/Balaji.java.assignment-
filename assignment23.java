static int[] twoSum(int[] a, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < a.length; i++) {
        int needed = k - a[i];

        if (map.containsKey(needed)) {
            int j = map.get(needed);
            return new int[]{j, i};
        }

        map.put(a[i], i);
    }

    return new int[]{-1, -1};
}
