package com.datastrcutures.trees;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class KthLargestSmallest {
    public static void main(String args[]){
        int arr[]= {45,78,90,87,2,3,8,5,34};
        int k=2;
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        for(int i=0;i< arr.length;i++){
            maxHeap.add(arr[i]);
            minHeap.add(arr[i]);
        }
        int l=k;
        while(l>0){
            System.out.println(maxHeap.poll());
            minHeap.poll();
            l--;
        }

    }
}
