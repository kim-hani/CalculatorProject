package calculator2;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private Queue<Double> result = new LinkedList<>();

    // getter
    public double getQueue(){
        if(result.isEmpty()){
            throw new IllegalStateException("저장된 결과값이 없습니다.연산을 먼저 수행하세요.");
        }
        return result.poll();
    }

    // setter
    public void clearQueue(){
        System.out.println("모든 결과 삭제");
        result.clear();
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
