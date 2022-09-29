class Solution {
    public int leastInterval(char[] tasks, int n) {
        // int ans
        
        int[] count=new int[26];
        
        for(int i=0;i<tasks.length;i++)
        {
            // System.out.println(Arrays.toString(count));
            count[tasks[i]-'A']+=1;
        }        
            
        
        Arrays.sort(count);
        int chunk=count[25]-1;
        int space= n*(count[25]-1);
        System.out.println(space);
        for(int i=24;i>=0;i--){
            space-=Math.min(chunk,count[i]);
        }
                  // System.out.println(space);

        return space<0?tasks.length:space+tasks.length;
            
    }
}