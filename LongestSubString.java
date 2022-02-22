public class LongestSubString {
    public static int returnLongestSequenceLength(String str){

        String test="";
        int maxLength=-1;
        for(char c:str.toCharArray()){
            String current=String.valueOf(c);
            if(test.contains(current)){
                test=test.substring(test.indexOf(current)+1);
            }
            else{
                test=test+String.valueOf(c);
               // System.out.println(test.length()+"testlenght");
               // System.out.println(maxLength+"maxlength");
                maxLength=Math.max(test.length(),maxLength);
                //System.out.println(maxLength);
            }

        }
        return  maxLength;
    }

    public static void main(String args[]){
        String str="geeksforgeeks";
        int m=returnLongestSequenceLength(str);
        System.out.println(m);

    }
}
