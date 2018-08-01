package com.DataStructures.application;

import com.DataStructures.Stack.Stack;

public class DijkstraTwoStack {

    private String expression;
    private String[] parsedExpression;

    static private final int MAX_EXP_LEN = 1000;

    DijkstraTwoStack(String _expression){
        this.expression = _expression;
        this.parsedExpression = new String[MAX_EXP_LEN];
    }

    DijkstraTwoStack(){
        expression = null;
        this.parsedExpression = new String[MAX_EXP_LEN];
    }

    public void setExpression(String _expression){
        this.expression = _expression;
    }

    public String getExpression() {
        return expression;
    }

    private void parseExpression(){
        int indexPointer = 0;
        for(int i = 0; i<this.expression.length(); i++){
            char c = this.expression.charAt(i);

            if(c == '(' || c == ')' || c == '+' || c == '-' || c == '*' || c == '/')
            {
                parsedExpression[indexPointer++] = Character.toString(c);
            } else if (isNumber(c)){
                //int start_index = i;
                int end_index = i;
                while(isNumber(this.expression.charAt(end_index))){
                    end_index++;
                }
                end_index--;
                String number = "";
                for (int j = i; j <= end_index; j++){
                    number += this.expression.charAt(j);
                }
                i = end_index;
                parsedExpression[indexPointer++] = number;
            }
        }
    }

    public double computeAtOnce() {

        if (this.expression == null)
            return 0.0;

        Stack<Character> ops = new Stack<>();
        Stack<Double> numbers = new Stack<>();

        for (int i = 0; i < this.expression.length(); i++) {

            char c = this.expression.charAt(i);

            if (isOp(c)) {
                ops.push(c);
            } else if (isNumber(c)) {
                int end_index = i;
                while (isNumber(this.expression.charAt(end_index))) {
                    end_index++;
                }
                end_index--;
                String number = "";
                for (int j = i; j <= end_index; j++) {
                    number += this.expression.charAt(j);
                }
                i = end_index;
                Double d = Double.parseDouble(number);
                numbers.push(d);
            } else if (c == ')') {
                char op = ops.pop();
                double d1 = numbers.pop();
                double d2 = numbers.pop();
                numbers.push(computeResult(op, d1, d2));
            }
            System.out.println("the ops stack is:");
            ops.show();
            System.out.println("\n\n");

            System.out.println("the numbers stack is:");
            numbers.show();
            System.out.println("\n\n");
        }

        while(!ops.isEmpty()){
            char op = ops.pop();
            double d1 = numbers.pop();
            double d2 = numbers.pop();
            double result = computeResult(op, d1, d2);
            numbers.push(result);
        }

        return numbers.pop();
    }

    private double computeResult(char op, double d1, double d2){
        if(op == '+')
            return d1+d2;
        else if (op == '-')
            return d1-d2;
        else if (op == '*')
             return d1*d2;
        else{
            if (d2 != 0)
                return d1/d2;
        }
        return 0.0;

    }

    public double compute(){

        if(this.expression == null)
            return 0.0;

        this.parseExpression();

        Stack<String> numbers = new Stack<>();
        Stack<String> operators = new Stack<>();

        // to be continued

        return 0.0;

    }

    private boolean isRightPar(String s){
        return s.equals(")");
    }


    private boolean isOp(char c){
        return (c == '+' || c == '-' || c == '*' || c == '/');
    }

    private boolean isNumber(char c){
        return (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0' || c == '.');
    }

    public void printParsed(){
        for(String s : this.parsedExpression){
            if( s != null){
                System.out.print(s);
            }
        }
    }

}
