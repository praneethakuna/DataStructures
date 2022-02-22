import java.util.Arrays;

public class Anangrams {

    public static void main(String [] args){
        String str="madam";
        char strArr[]= new char[100];

        strArr=str.toCharArray();

        Arrays.sort(strArr);

        for (int i=0;i<strArr.length;i++){
            System.out.println(strArr[i]);
        }
    }
}
