package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private Queue<Double> result = new LinkedList<>();

    public double getQueue(){
        return result.poll();
    }

    public double calculate(int n1,String operator,int n2) {
        double total=0;
        switch (operator) {
            case ("+"):
                total = n1+n2;
                break;
            case ("-"):
                total = n1-n2;
                break;
            case ("*"):
                total = n1*n2;
                break;
            case ("/"):
                total = (double)n1/n2;
                break;
        }
        result.add(total);
        return total;
    }


}
