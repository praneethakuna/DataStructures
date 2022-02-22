import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianSortedArrays {

    public static void main(String args[]){
        int a[] = new int[] {1,2};
        int b[] = new int []{3,4};

        int m=a.length;
        int n=b.length;

     int len= m+n;
     int arr[]= new int[len];

     for(int i=0;i<a.length;i++){
         arr[i]=a[i];
     }

     for(int i=0;i<b.length;i++){
         arr[a.length+i]=b[i];

     }

     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]);
     }


     int p=arr.length;

     if(p%2==0){
         int median=p/2;
         System.out.println(arr[median]);
     }
     else{
         float oddmedian=p/2;
        int oddValue= Math.round(oddmedian);
        System.out.println(oddmedian);

     }







    }
}
