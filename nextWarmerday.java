//TC: O(N) where N is the length of temperatures array
//SC: O(N) where N is the length of temperatures array

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] res=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int index=s.pop();
                res[index]=i-index;
            }
            s.push(i);
        }
        return res;
    }
}