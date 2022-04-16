class Solution {
    public int sumBase(int n, int k) {
        
        
        int ans=0;
        int div=1;
        
        while(n>0){
        int rem=n%k;
        n=n/k;
        
        ans+=rem*div;
        div=div*10;
        }
        int sum=0;
        while(ans >0){
        int r=ans%10;
        sum+=r;
            ans=ans/10;
        }
        return sum;
    }
}