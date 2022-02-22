import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCombinations {
    public static  void main(String args[]){
        int num []= {2,3};
        int len=num.length;
        String table []={"0","1", "abc",  "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String>  strList= new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("");
        while(!q.isEmpty()){
            String s= q.remove();
            if(s.length()==len){
                strList.add(s);
            }
            else{
                String value=table[num[s.length()]];
                for(int i=0;i<value.length();i++){
                    q.add(s+value.charAt(i));
                }
            }
        }
        for( int j=0;j<strList.size();j++){
            System.out.println(strList.get(j));
        }
    }
}
