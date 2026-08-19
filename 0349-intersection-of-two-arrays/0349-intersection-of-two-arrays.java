class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;
        for(int num : nums1){
            set.add(num);
        } 
        for(int num : nums2){
            if(set.contains(num)){
                result[k++] = num;
                set.remove(num);
            }
        }
        return Arrays.copyOf(result, k);
    }
}