class Solution {
    public List<List<Integer>> generate(int n) {
        Scanner scn = new Scanner(System.in);
        
        List<List<Integer>> list1=new ArrayList<List<Integer>>(); 
        
        for(int i=0;i<n;i++){
            List<Integer> list=new ArrayList<Integer>(); 
            for(int j=0;j<=i;j++){
             if(j==0||j==i){
                 list.add(1);
             }
                else{
                   List<Integer>row=list1.get(i-1);
                    int x=row.get(j-1)+row.get(j);
                    list.add(x);
                }
            }
            
            list1.add(list);
        }
        return list1;
    }
}