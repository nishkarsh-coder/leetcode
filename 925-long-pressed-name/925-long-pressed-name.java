class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;
        int j=0;
        int n1=name.length();
        int n2=typed.length();
        if(name.charAt(i)!=typed.charAt(j)){
            return false;
        }
        while(j<n2){
            // if(i==n1){
            //     break;
            // }
            if(i!=n1&&name.charAt(i)==typed.charAt(j)){
            i++;
                j++;
            }else if(name.charAt(i-1)==typed.charAt(j)){
            j++;                
            }else{
                System.out.println(i+" "+j);
                return false;
            }
        }
        return i==n1? true: false;
    }
}