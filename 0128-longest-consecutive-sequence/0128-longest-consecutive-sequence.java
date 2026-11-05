class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        TreeMap<Integer, Integer> ma = new TreeMap<>();
        for(int i = 0; i<nums.length; i++){
            ma.put(nums[i], 1);
           }
           int pre = -1000000000;
           int count = 1;
           int ans = 1;
           for(TreeMap.Entry<Integer,Integer>e:ma.entrySet()){
            if(pre+1==e.getKey()){
                count++;
            }
            else{
                ans = Math.max(ans,count);
                count=1;
            }
            pre = e.getKey();
           }
           ans = Math.max(ans, count);
        return ans;
    }
}