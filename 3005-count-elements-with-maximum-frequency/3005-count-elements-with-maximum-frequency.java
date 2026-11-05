class Solution {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int maxFreq = 0;

        for (int freq : map.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        int answer = 0;

        for (int freq : map.values()) {
            if (freq == maxFreq) {
                answer += freq;
            }
        }

        return answer;
        }
}