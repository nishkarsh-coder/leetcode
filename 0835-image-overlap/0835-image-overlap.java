class Solution {
    
    class pair{
        int i;
        int j;
        pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    
    public int largestOverlap(int[][] img1, int[][] img2) {
        ArrayList<pair> arr1=new ArrayList<>();
        for(int i=0;i<img1.length;i++){
            for(int j=0;j<img1[0].length;j++){
                if(img1[i][j]==1){
                    arr1.add(new pair(i,j));
                }
            }
                
        }
        ArrayList<pair> arr2=new ArrayList<>();
        for(int i=0;i<img2.length;i++){
            for(int j=0;j<img2[0].length;j++){
                if(img2[i][j]==1){
                    arr2.add(new pair(i,j));
                }
            }     
        }
        
        HashMap<String ,Integer> hm=new HashMap<>();
        for(pair p: arr1){
            for(pair o: arr2){
            String ans="";
                int i=o.i-p.i;
                if(i>0){                    
                while(i-->0){
                    ans+='D';
                }
                }
                else{
                 while(i++<0){
                    ans+='U';
                }   
                }

                int j=o.j-p.j;
                if(j>0){                    
                while(j-->0){
                    ans+='R';
                }
                }
                else{
                 while(j++<0){
                    ans+='L';
                }   
                }
             
              hm.put(ans,hm.getOrDefault(ans,0)+1); 
       
            }
            
        }
        System.out.println(hm);
        int max=0;
        for(String str: hm.keySet()){
            max=Math.max(max,hm.get(str));
        }
        return max;
    }
}