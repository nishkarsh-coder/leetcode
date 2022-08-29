class Solution {
    public int[] sortedSquares(int[] arr){
        int n=arr.length;
        int[] s=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                arr[i]=-arr[i];
            }
        }
        int x=n-1;
        int y=0;
        for(int j=n-1;j>=0;j--){
            if(arr[x]>arr[y]){
            s[j]=arr[x];
            x--;
            }else{
            s[j]=arr[y];
            y++;    
            }
        }
        
        for(int i=0;i<n;i++){
            s[i]=s[i]*s[i];
        }
        return s;
    }
}