public class LongestCommonSubsequence {
public static int LongestPalindromeSubsequence(String s1,String s2, int a,int b){



   char c1[]= s1.toCharArray();
   char c2[]=s2.toCharArray();

   int LCS[][]=new int [a+1][b+1];

   for(int i=0;i<=a;i++){
       LCS[i][0]=0;
   }

    for(int j=0;j<=b;j++){
        LCS[0][j]=0;
    }

    for(int i=1;i<=a;i++){
       for(int j=1;j<=b;j++){
           if(c1[i-1]==c2[j-1]){
               LCS[i][j]=1+LCS[i-1][j-1];
           }
           else{
               LCS[i][j]=Math.max(LCS[i-1][j],LCS[i][j-1]);
           }
       }
    }


    return LCS[a][b];

}


    public static void main(String args[]){
        String str="abcde";
        String str2="ace";

        int i=LongestPalindromeSubsequence(str,str2,str.length(),str2.length());

        System.out.println(i);

//        List<String> strList1= new ArrayList<>();
//        List<String> strList2= new ArrayList<>();
//        for(int i=0;i<=str.length();i++){
//            for(int j=i+1;j<=str.length();j++){
//               System.out.println(str.substring(i,j));
//                strList1.add(str.substring(i,j));
//            }
//
//        }
//        for(int i=0;i<=str2.length();i++){
//            for(int j=i+1;j<=str2.length();j++){
//                // System.out.println(str.substring(i,j));
//                strList2.add(str2.substring(i,j));
//            }
//
//        }
//
//        Collections.sort(strList1);
//        Collections.sort(strList2);
//
//        strList1.retainAll(strList2);
//
//
//int max=0;
//        for(int i=0;i<strList1.size();i++){
//            String s=strList1.get(i);
//            max=Math.max(s.length(),max);
//
//        }
//        System.out.println(max);






    }
}
