class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n;
        int x=0;
        for(int i =0; i<operations.length; i++){
            if(operations[i].contains("++")){
            x++;
            }
            else{
                x--;
            }
        }
        return x;
    }
}