package main.java.com.interpreter;

public class InterpreterDemo {
    static Expression buildInterpreterTree(){

        Expression terminal1 = new TerminalExpression("lion");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        Expression alternation1 = new AndExpression(terminal2, terminal3);
        Expression alternation2 = new OrExpression(terminal1, alternation1);


        return terminal1;
    }

    public static void main(String[] args){
        String context = "Lions";
        //String context = "Tigers";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }
}
