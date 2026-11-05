class Solution {
    public int countSpecialIntegers(int[] nums) {
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            boolean found = false;
            for(int k = 0; k<i; k++){
                if(nums[k]==nums[i]){
                    found = true;
                }
            }
            if(found) 
            continue;
            int count = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count ==3){
                int a = -1,b=-1,c=-1;
                for(int j = 0; j<nums.length; j++){
                    if(nums[i]==nums[j]){
                        if(a==-1)
                            a =j;
            else if(b==-1)
            b = j;
                        else
            c=j;
                    }
                }
                if(b-a == c-b)
                ans++;
            }
        }
        return ans;
    }
}