import java.util.Stack;

public class InfixtoPostfix {

    static int prec(char c){
        if((c=='+')|| (c=='-')){
            return 1;
        }
        if((c=='/') ||(c=='*')){
            return 2;
        }
        if(c=='^'){
            return 3;
        }
        return -1;
    }
    static  String infixToPostfix(String infix) {
        String postfix = new String("");
        Stack<Character> infixToPostfix = new Stack<>();

        for (int i = 0; i < infix.length(); ++i) {
            //System.out.println("inside if");
           char symbol = infix.charAt(i);
           // System.out.println(symbol);
            if (Character.isAlphabetic(symbol)) {
                postfix = postfix + symbol;
            }
            else if (symbol == '(') {
                System.out.println("inside else if");
                infixToPostfix.push(symbol);
            }
             else if (symbol == ')') {
                while (!infixToPostfix.isEmpty() && (infixToPostfix.peek() != '(')) {
                    postfix = postfix + infixToPostfix.pop();
                    infixToPostfix.pop();
                }
            } else {
                while (!infixToPostfix.isEmpty() && (prec(symbol) <= prec(infixToPostfix.peek()))) {
                    postfix = postfix + infixToPostfix.pop();
                }

            }
            infixToPostfix.push(symbol);
        }
        while (!infixToPostfix.isEmpty()) {
            if (infixToPostfix.peek( ) == '(')
                //return "Invalid Expression";
                postfix += infixToPostfix.pop( );
        }
        return postfix;
    }

    public static void main(String[] args){
        //System.out.println("inside main");
        String infix="a+b";
        String postfix=infixToPostfix(infix);
        System.out.println(infix);

    }
}
