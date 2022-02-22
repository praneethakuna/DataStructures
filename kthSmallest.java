

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class TopKSmallest {
    public static void main(String args[]){
        int arr[] ={3,7,87,89,10,4,5};
        int k=4;
        PriorityQueue<Integer> maxHeap= new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<k;i++){
            maxHeap.add(arr[i]);
        }
        for(int j=k;j<arr.length;j++){
            if(arr[j]>maxHeap.peek()){
                continue;
            }
            else{
                maxHeap.poll();
                maxHeap.add(arr[j]);
            }
        }
        Iterator i= maxHeap.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


    }
}
