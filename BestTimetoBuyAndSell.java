public class BestTimetoBuyandSell {


//        public static  int maxProfit(int[] prices) {
//
//            int min = prices[0];
//            int index = -1;
//            int max = 0;
//
//
//            for (int i = 0; i < prices.length; i++) {
//                if (prices[i] < min) {
//                    min = prices[i];
//                    index = i;
//                    //System.out.println(index);
//
//
//                }
//            }
//
//            if (index == prices.length) {
//                return 0;
//            }
//            for (int j = index + 1; j < prices.length ; j++) {
//                for (int k = j + 1; j < prices.length-1; k++) {
//
//                    if (prices[k] - prices[j] > max) {
//                        max = prices[k] - prices[j];
//                    }
//                    System.out.println(max);
//                }
//            }
//
//                return max;
//
//
//        }
    public static void main(String args[]) {
        int prices[] = new int[]{1, 2};


        int min = prices[0];
        int index = -1;
        int max = 0;
        int maxProfit = 0;


        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= min) {
                min = prices[i];

            }
            else if(prices[i]-min>maxProfit){
                maxProfit=prices[i]-min;
            }
        }

System.out.println(maxProfit);
    }
}
