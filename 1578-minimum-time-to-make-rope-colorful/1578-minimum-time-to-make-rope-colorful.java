class Solution {
    public int minCost(String colors, int[] neededTime) {
        
        
        char[] c= colors.toCharArray();
        int time=0;
        int s=-1;
        int e=-1;
        for(int i=0;i<c.length-1;i++){
            if(c[i]==c[i+1]){
                if(s==-1){
                    s=i;
                      e=i+1;

                }else{
                    e=i+1;
                }
            }else if(s!=-1&&e!=-1){
                int fgreat=0;
                // int sgreat=0;
                for(int j=s;j<=e;j++){
                    if(fgreat<neededTime[j]){
                        fgreat=neededTime[j];
                        // sgreat=fgreat;
                    }
                    
                    time+=neededTime[j];
                }
                time=time-fgreat;
                s=-1;
                e=-1;
            }
        }
        if(s!=-1&&e!=-1){
          int fgreat=0;
                // int sgreat=0;
                for(int j=s;j<=e;j++){
                    if(fgreat<neededTime[j]){
                        fgreat=neededTime[j];
                        // sgreat=fgreat;
                    }
                    
                    time+=neededTime[j];
                }
                time=time-fgreat;  
        }
            
        
        
        return time;
        
    }
}