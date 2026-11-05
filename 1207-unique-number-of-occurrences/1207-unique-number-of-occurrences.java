class Solution {
    public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer, Integer> ma = new HashMap<>();
    for(int i = 0; i<arr.length; i++){
        ma.put(arr[i],ma.getOrDefault(arr[i],0)+1);
    }
    HashMap<Integer, Integer> frequency = new HashMap<>();
    for(HashMap.Entry<Integer,Integer>e:ma.entrySet()){
        if(frequency.containsKey(e.getValue())){
            return false;
        }
    frequency.put(e.getValue(),1);
    }
    return true;
    }
}