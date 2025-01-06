package calculator3;

import java.util.function.BiFunction;

public enum OperatorType {
    ADD("+",(n1,n2) -> n1+n2),
    SUB("-",(n1,n2) -> n1-n2),
    MUL("*", (n1,n2) -> n1*n2),
    DIV("/",(n1,n2) -> {
        if(n2 ==0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
        return n1/n2;
    });

    private final String operator;
    private final BiFunction<Double,Double,Double> operation;
    private OperatorType(String operator,BiFunction<Double,Double,Double> operation){
        this.operator = operator;
        this.operation = operation;
    }

    public String getOperator(){
        return operator;
    }

    public double apply(double n1,double n2){
        return operation.apply(n1,n2);
    }

    public static OperatorType fromOperator(String operator){
        for(OperatorType op : values()){
            if(op.operator.equals(operator)){
                return op;
            }
        }
        throw new IllegalStateException("정확한 연산자를 입력하세요.");
    }
}
