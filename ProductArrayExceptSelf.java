public class ProductArrayExceptSelf {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int prod[]= new int[n];
        int left[]= new int[n];
        int right[]= new int[n];
//        left[0]=1;
//        right[n-1]=1;
//        for(int i=1;i<n;i++){
//            left[i]=arr[i-1]*left[i-1];
//        }
//        for(int j=n-2;j>=0;j--){
//            right[j]=arr[j+1]*right[j+1];
//        }
//        for(int k=0;k<n;k++){
//            prod[k]=left[k]*right[k];
//        }

//        for(int i=0;i<n;i++){
//            System.out.println(prod[i]);
//        }
        int flag=0;
        int product=1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                flag++;
            }
            else{
                product=product*arr[i];
            }

        }
        for(int i=0;i<n;i++){
            if(flag>1){
                prod[i]=0;
            }
            else if((flag==1) && (arr[i]!=0)){
                prod[i]=0;
            }
            else if(flag==0){
                prod[i]=(product/arr[i]);
            }
            else{
                prod[i]=product;
            }
        }
        for(int i=0;i<n;i++){
  System.out.println(prod[i]);
       }



    }
}
