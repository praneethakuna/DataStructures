import java.util.Iterator;
import java.util.PriorityQueue;

public class TopKSmallestLargest {
    public static void main(String args[]){
        int arr[]={2,11,19,45,78,90,43,1,3};
        int k=3;
        PriorityQueue<Integer> minHeap= new PriorityQueue<>();
        for(int i=0;i<k;i++){
            minHeap.add(arr[i]);

        }
        for(int j=k;j< arr.length;j++){
            if(arr[j]<minHeap.peek()){
                continue;

            }
            else{
                minHeap.poll();
                minHeap.add(arr[j]);
            }
        }
        Iterator i= minHeap.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
