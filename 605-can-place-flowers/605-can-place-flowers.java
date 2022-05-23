class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        
        int i=0;
        int ans=0;
        while(i<arr.length){
            
        if(arr[i]==0){
int prev= (i==0||arr[i-1]==0)?0:1;
        int next= (i==arr.length-1||arr[i+1]==0)?0:1;

        if(next==0&&prev==0){
            arr[i]=1;
            ans++;
        }
        }
        
        i++;
        }
//             for(int k=0;k<arr.length;k++){
// System.out.println(arr[k]);
//             }
        return ans>=n;
    }
}