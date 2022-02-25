public class MinimumSumClimbingStaira {
    public static void main(String args[]){
        int arr[]={1,100,1,1,1,100,1,1,100,1};
        for(int i=0;i<arr.length;i++){
            if(i==0|| i==1) continue;
            arr[i]=arr[i]+Math.min(arr[i-1],arr[i-2]);
        }

      System.out.print(Math.min(arr[arr.length-1],arr[arr.length-2]);

    }
