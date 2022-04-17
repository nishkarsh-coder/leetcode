class Solution {
    public double myPow(double x, int n) {
        if(n==0){

        return 1;
        }
        
        if(n>0){
        double ans =myPow(x,n/2);
        if(n%2==0){
        return ans*ans;        
        }
        else{
        return ans*ans*x;        
        }
        }
        else{
        // return (1/x)*myPow(x,n+1);
        double ans =myPow(x,n/2);
        if(n%2==0){
        return ans*ans;        
        }
        else{
        return ans*ans*(1/x);        
        }
        }
        
    }
}