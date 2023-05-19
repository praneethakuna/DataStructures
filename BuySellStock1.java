public class BuySellStock1 {
    public int sellStock(int [] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    max=Math.max(arr[j]-arr[i],max);
                }

            }
        }
        return max;
    }

    public int sellStockOptimal(int arr[]){
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0 ;i<arr.length;i++){
            min=Math.min(arr[i],min);
            profit=Math.max((arr[i]-min),profit);
        }
        return profit;
    }
}
