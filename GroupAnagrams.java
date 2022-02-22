import java.util.*;

public class GroupAnangrams {

    public static List<List<String>> groupAnagrams1(String[] str) {
        if (str.length == 0) {
            return new ArrayList();
        }
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : str) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) {
                ans.put(key, new ArrayList());
            }
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

    public static void main(String args[]) {

        String[] data =  {"eat","tea","tan","ate","nat","bat"};
        //String[] data = {"", "b"};
        List<List<String>> list = groupAnagrams1(data);
        System.out.print('[');
        for (List<String> f : list) {
            System.out.print(f);
        }
        System.out.print(']');
    }
}
