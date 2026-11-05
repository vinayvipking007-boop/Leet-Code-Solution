class Solution {
    public int findJudge(int n, int[][] trust) {
    for(int i = 1; i<=n; i++){
        int count = 0; 
        int trustcount = 0;
        for(int j = 0; j<trust.length; j++){
        if(trust[j][0]==i){
            trustcount++;
        }
        if(trust[j][1]==i){
            count++;
        }
    }
    if(trustcount == 0 && count == n-1){
        return i;
    }
    }
    return -1;
}
}