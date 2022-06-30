class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Arrays.sort(nums1);
        // Arrays.sort(nums2);
        // int n = nums1.length>nums2.length?nums1.length:nums2.length;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<nums1.length;i++){
            if(hm.containsKey(nums1[i])){
                 hm.put(nums1[i],hm.get(nums1[i])+1);

            }else{
            hm.put(nums1[i],1);

            }

        }
                HashMap<Integer,Integer> hm1=new HashMap<Integer,Integer>();
         for(int i=0;i<nums2.length;i++){
            if(hm1.containsKey(nums2[i])){
                        // System.out.println(hm1.get(nums2[i])+"jj");

                 hm1.put(nums2[i],hm1.get(nums2[i])+1);
                        // System.out.println(hm1.get(2)+"kk");

                // System.out.println("gh");
            }else{           hm1.put(nums2[i],1);
}
           // hm1.put(nums2[i],1);
        }
        System.out.println(hm1.get(2));
        ArrayList<Integer> arr=new ArrayList<>();
        // HashMap<Integer,Integer> h=nums1.length>nums2.length?hm:hm1;
        for(Integer key:hm1.keySet()){
            if(hm.containsKey(key)){
                int a= hm1.get(key)>hm.get(key)?hm.get(key):hm1.get(key);
                // System.out.println(a);   
                for(int i=0;i<a;i++)
                    {
                        
                        arr.add(key);
                    }
            }
        }
        int [] ans=new int[arr.size()];        
        for(int i=0;i<arr.size();i++){
        ans[i]=arr.get(i);
        }
        return ans;
    }
}