class Solution {
    public int findJudge(int n, int[][] t) {
        int[] count=new int[n+1];
        
        for(int[] i: t){
            count[i[0]]--;
            count[i[1]]++;
        }
        // for(int j: count){
        //     System.out.println(j);
        // }
        for(int i=1;i<=n;i++){
            if(count[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}