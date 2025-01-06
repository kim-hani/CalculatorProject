package calculator3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArithmeticCalculator<T extends Number> {
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

    public void clearResult(){
        System.out.println("모든 결과값들을 삭제합니다.");
        result.clear();
    }

    // 입력값보다 큰 값들만 반환 , 스트림과 람다로 구현
  public ArrayList<Double> greaterResult(double input){
        return result.stream()
                .filter(value-> value > input)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // 내림차순 정렬
    public ArrayList<Double> descendSort(){
        return result.stream()
                .sorted((n1,n2) -> Double.compare(n2,n1))
                .collect(Collectors.toCollection(ArrayList::new));
    }


    public double calculate(T n1,String op,T n2){
        OperatorType operator = OperatorType.fromOperator(op);
        double total = operator.apply(n1.doubleValue(),n2.doubleValue());
        result.add(total);
        return total;
    }
}
