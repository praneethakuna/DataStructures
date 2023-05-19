public class Sort0s1s2s {
    public int[] sort0s1s2s(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public int sortBetter(int arr[]){
        return 0;
        //just keep a track of how many zeros ones and twos and then run the loops from 0-cnt1 fill zeros
        //from cnt1- cnt1+cnt2 fill 1 and cnt1+cnt2- cnt3 fill 2's time complexity 0(2N)
    }

    public int[] sortOptimal(int arr[]){
        int mid=0;
        int low=0;
        int high=arr.length-1;
        int temp=0;
        while(mid<=high){
            switch (arr[mid]){
                case 0:{
                     temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                    break;
                }

            }
        }
        return arr;
    }
}
