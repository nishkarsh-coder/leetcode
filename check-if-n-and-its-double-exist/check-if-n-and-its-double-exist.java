class Solution {
    
    public boolean check(int[] arr,int a,int pos){

    for(int i=0;i<arr.length;i++){
    if(arr[i]==a&&pos!=i){
        return true;
    }
    }
        return false;
        
    }
    
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
        
            if(check(arr,arr[i]*2,i)){
                return true;
            }
        }
        return false;
    }
}