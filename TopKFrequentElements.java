import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {
    public static void main(String args[]){
        int arr[]={1,2,1,2,3,1,2,3,2,4};
        int k=3;

        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>=k){
                System.out.println(entry.getKey());
            }

        }
    }
}
