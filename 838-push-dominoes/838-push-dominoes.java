class Solution {
    public String pushDominoes(String dominoes) {
        
        StringBuilder ans=new StringBuilder();
        
        dominoes="L"+dominoes+"R";
        char[] arr= dominoes.toCharArray();
        int prev=-1;
        int next=-1;
        int j=0;
        int k=1;
        
        while(k<arr.length){
          while('.'==arr[k]){
              k++;
          }
            
         helper(arr,j,k);
          j=k;
          k=k+1;
        }
        
        
        return new String(arr).substring(1,arr.length-1);
    }
    
    void helper(char[] arr,int i,int j){
        // System.out.println(i+" "+j);
        if(arr[i]=='L'&&arr[j]=='L'){
            int k=i+1;
            while(k<j){
                arr[k++]='L';
            }
        }else if(arr[i]=='R'&&arr[j]=='R'){
            int k=i+1;
            while(k<j){
                arr[k++]='R';
            }
        }else if(arr[i]=='R'&&arr[j]=='L'){
            if((j-i-1)%2==0){
                //even
                int k=i+1;
            while(k<=i+(j-i-1)/2){
                arr[k++]='R';
            } 

            while(k<j){
                arr[k++]='L';
            } 
            
            
            }else{
                //odd
                // System.out.println("lodd");
            int k=i+1;
            while(k<=i+(j-i-1)/2){
                arr[k++]='R';
            } 
            k++;
            while(k<j){
                arr[k++]='L';
            } 
                
            }
        }
    }
    
    
    
}