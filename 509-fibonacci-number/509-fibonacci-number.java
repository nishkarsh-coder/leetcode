class Solution {
    public int fib(int n) {
        
        int a=0;
        int b=1;
        int ans=0;
        if(n==1){
        return 1;
        }
        
        while(n>1){
        ans=a+b;
        a=b;
        b=ans;n--;
        }
        return ans;
    }
}