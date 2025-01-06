package calculator2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private ArrayList<Double> result = new ArrayList<>();

    // 가장 최근 값 가져오기
    public double getResult(){
        return result.get(result.size()-1);
    }

    // 가장 먼저 저장된 값 제거
    public void removeResult(){
        System.out.println("가장 먼저 저장된 값을 삭제합니다 : " + result.get(0));
        result.remove(0);
    }

    // 모든 값을 삭제함
    public void clearResult(){
        System.out.println("모든 결과값들을 삭제합니다.");
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
