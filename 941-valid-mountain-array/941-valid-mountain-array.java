class Solution {
    public boolean validMountainArray(int[] arr) {
        
        boolean inc=true;
        if(arr.length<3){
            return false;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1]&&inc==true){
                inc=false;
                if(i==0){
                return false;
                }
            }
            
            if(arr[i]==arr[i+1]){
                return false;
            }            
            if(arr[i]<=arr[i+1]&&inc==false){
                return false;
            }
        }
        
        if(inc==true){
        return false;
        }
        return true;
    }
}