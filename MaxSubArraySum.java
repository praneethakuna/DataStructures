public class MaxSubArraySum {
    public int maxSubArraySum(int [] arr){  //Complexity is O[N^3]
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<j;k++){
                    sum=sum+arr[k];
                }
                max=Math.max(sum,max);
            }
        }
        return max;
    }
    public int maxSubArraySumBetter(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];

                max=Math.max(sum,max);
            }
        }
        return max;
    }
    public int kadaneAlgo(int [] arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for( int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            max=Math.max(sum,max);
        }
        return max;

    }
}
