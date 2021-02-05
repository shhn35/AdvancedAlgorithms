package de.shhn.Algorithm.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap();
        List<Integer> uniqList = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++){
            if(!freq.containsKey(nums[i]))
                uniqList.add(nums[i]);
            freq.put(nums[i],(freq.getOrDefault(nums[i],0)+1));
        }

        int[] uniqs = new int[uniqList.size()];
        for(int i=0;i<uniqList.size();i++)
            uniqs[i] = uniqList.get(i);

        int L = 0,
                R = uniqs.length-1,
                pIndex = 0;

        while(L<R){
            pIndex = partition(freq,uniqs,L,R);
            if(pIndex == uniqs.length - k)
                break;
            else if(pIndex < uniqs.length - k)
                L = pIndex+1;
            else
                R = pIndex-1;
        }


        return Arrays.copyOfRange(uniqs,L,uniqs.length);
    }

    private int partition(HashMap<Integer,Integer> freq,int[] uniqs,int L, int R){
        int pivot = freq.get(uniqs[R]);
        int pIndex = L;
        for(int i=L;i<R;i++){
            if(freq.get(uniqs[i]) <= pivot){
                swap(uniqs,i,pIndex);
                pIndex++;
            }
        }
        swap(uniqs,R,pIndex);
        return pIndex;
    }

    private void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
