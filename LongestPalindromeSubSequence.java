public class LongestPalindromeSequence {

    private static int longestPalindromeSequence(String str) {

        int n=str.length();
        int count=str.length();
        int maxLps=1;

        boolean arr[][]= new boolean[n][n];

        for(int i=0;i<n;i++){
            arr[i][i]=true;


        }
        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(str.charAt(i)==str.charAt(j)){
                    if((arr[i+1][j-1])||(j-i==1)){
                        arr[i][j]=true;
                        count++;



                        maxLps=Math.max(maxLps,j-i+1);

                    }
                }
            }
        }
        return count;
    }


    public static void main(String args[]){
        String str="bcacbf";

        System.out.print(longestPalindromeSequence(str));
    }


}
