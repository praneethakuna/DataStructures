import java.util.Stack;

public class BaseballGame {
    public static  void main(String args[]){
        String [] ops= {"5","-2","4","C","D","9","+","+"};
        Stack<Integer> st = new Stack<>();
        int sum=0;
        for(String op:ops){
            if(op.equals("+")){
                int prev=st.pop();
                int prevPrevValue=st.peek();
                int newScore=prev+prevPrevValue;
                sum+=newScore;
                st.push(prev);
                st.push(newScore);

            }
            else if(op.equals("C")){
                sum-=st.pop();
            }
            else if(op.equals("D")){
                sum+=st.peek()*2;
                st.push(st.peek()*2);

            }
            else {
                st.push(Integer.parseInt(op));
                sum += st.peek();
            }
        }
        System.out.println(sum);
    }
}
