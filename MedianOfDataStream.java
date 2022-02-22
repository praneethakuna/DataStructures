class MedianFinder {
   PriorityQueue<Integer> minHeap;
     PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        minHeap= new PriorityQueue<>();
        maxHeap= new PriorityQueue<>(Comparator.reverseOrder());
        
    }
    
    public void addNum(int num) {
        if(!minHeap.isEmpty() && num<minHeap.peek()){
            maxHeap.offer(num);
            if(maxHeap.size()>minHeap.size()+1){
                minHeap.offer(maxHeap.poll());
            }
        }
        else{
            minHeap.offer(num);
            if(minHeap.size()>maxHeap.size()+1){
                maxHeap.offer(minHeap.poll());
            }
        }
   
        
    }
    
    public double findMedian() {
        
      double median;
        if (minHeap.size() < maxHeap.size()) {
            median = maxHeap.peek();
        } else if (minHeap.size() >maxHeap.size()) {
            median = minHeap.peek();
        } else {
            median = 0.5*(minHeap.peek() + maxHeap.peek()); 
        }
        return median;
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
