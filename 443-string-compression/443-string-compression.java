class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int count=1;
        int k=0;
        if(n==1){
            return 1;
        }
        for(int i=0;i<n-1;i++)
        {
            if(chars[i]==chars[i+1]){
                count++;
            }else{
                if(count==1){
                chars[k]=chars[i];
                k++;
                }else{
                    chars[k]=chars[i];
                    k++;
                    for(char c: Integer.toString(count).toCharArray())
                    {
                        chars[k]=c;
                        k++;
                    }
                }
                    count=1;
            }
        }
        if(chars[n-2]!=chars[n-1]){
            chars[k]=chars[n-1];
            k++;
        }else{
            chars[k]=chars[n-1];
                    k++;
                    for(char c: Integer.toString(count).toCharArray())
                    {
                        chars[k]=c;
                        k++;
                    }
        }
        
        return k;
    }
}