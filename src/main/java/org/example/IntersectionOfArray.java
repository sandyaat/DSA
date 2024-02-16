package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfArray {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Map<Integer,Integer> tmap=new HashMap<Integer,Integer>();
        List<Integer> ansList=new ArrayList<>();
        for(int i=0;i<=n1;i++){
            if( tmap.containsKey(nums1[i])){
             tmap.put(nums1[i],tmap.get(nums1[i])+1);
            }else{
                tmap.put(nums1[i],1);
            }
        }

        for(int j=0;j<=n2;j++){
            if(tmap.get(nums2[j])>0){
                tmap.put(nums2[j],tmap.get(nums2[j])-1);
                ansList.add(nums2[j]);
            }

        }
return ansList.stream()
        .mapToInt(Integer::intValue)
        .toArray();
    }
}
