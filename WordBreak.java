import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set =new HashSet<>(wordDict);
        int n= s.length();
        Boolean b[]  = new Boolean[n+1];
        b[0]=true;
        for (int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(b[j] && set.contains(s.substring(j,i))){
                    b[i]=true;
                }
            }
        }
        return b[n];

    }
    public static void main(String args[]){
        boolean n= wordBreak("leetCode", Collections.singletonList("['leet','code']"));
        System.out.println(n);
    }
}
