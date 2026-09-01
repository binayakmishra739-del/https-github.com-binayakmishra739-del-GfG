class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int curr = 0;
        
        for (int i =0; i<k; i++){
            curr ^= arr[i];
        }
        int max = curr;
        
        for (int i =k; i< arr.length; i++){
            curr ^= arr[i-k]^ arr[i];
            max = Math.max(max, curr);
        }
        return max;
    }
}
