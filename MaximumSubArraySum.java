public class MaximumSubArray {
    public static void main(String args[]){
        int arr[]= new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int sum=0;
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            if(sum>max){
                max=sum;
            }
        }
        System.out.println(max);

    }
}
