class Solution {
    public ArrayList<Integer> pronicNumbers(int n) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        while (true){
            int pronic = i*(i+1);
            if(pronic > n){
                break;
            }
            result.add(pronic);
            i++;
        }
        return result;
    }
}