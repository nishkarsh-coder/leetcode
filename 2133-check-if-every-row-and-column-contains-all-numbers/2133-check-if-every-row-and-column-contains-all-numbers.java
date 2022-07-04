class Solution {
    public boolean checkValid(int[][] mat) {
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
            int n=mat[i][j];
                if(n>mat.length){
                    return false;
                }
                String row="row"+i+"."+n;
                String col="col"+j+"."+n;
                if(h.contains(row)){
                    System.out.println(row);
                    return false;
                }else{
                    h.add(row);
                }    
                if(h.contains(col)){
                    System.out.println(col);
                    return false;

                }else{
                    h.add(col);
                }    
            }
        }
        return true;
    }
}