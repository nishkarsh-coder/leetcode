class TimeMap {
    // int[] arr;
    class pair{
        int time;
        String val;
        pair(int time,String val){
            this.time=time;
            this.val=val;
        }
    }
    HashMap<String,ArrayList<pair>> hm;
    public TimeMap() {
        
        // arr=new int[10000001];
       hm=new HashMap<String,ArrayList<pair>>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(hm.containsKey(key)){
            ArrayList<pair> a=hm.get(key);
            a.add(new pair(timestamp,value));
            hm.put(key,a);
        }else{
            ArrayList<pair> a=new ArrayList<pair>();
            a.add(new pair(timestamp,value));
            hm.put(key,a);
        }
    }
    
    public String get(String key, int timestamp) {
        if(hm.get(key)==null){
            // System.out.println(hm+" "+key);
            return "";
        }
                    // System.out.println(hm+" "+key+" ");
        // System
        ArrayList<pair> a=hm.get(key);
        // System.out.println(arr.toString());
        
        int ind= binary(a,timestamp);
        if(ind==-1){
        return "";
        }
        // System.out.println(a.get(ind).val+" "+hm);
        return a.get(ind).val;
    }
    
    public int binary( ArrayList<pair> a,int target){
        int s=0;
        int e=a.size()-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(a.get(mid).time==target){
                return mid;
            }else if(a.get(mid).time<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        
        return e;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */