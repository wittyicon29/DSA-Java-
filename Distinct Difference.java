class Solution{
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A){
        ArrayList<Integer> left = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<N;i++){
            left.add(hs.size());
            hs.add(A[i]);
        }
        ArrayList<Integer> right = new ArrayList<>();
        hs.clear();
        for(int i=N-1;i>=0;i--){
            right.add(hs.size());
            hs.add(A[i]);
        } 
        Collections.reverse(right);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<N;i++){
            ans.add(left.get(i)-right.get(i));
        }
        return ans;
    }
}