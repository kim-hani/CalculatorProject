package calculator3;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Double> arithmeticCalculator = new ArithmeticCalculator<>();

        label:
        while(true){
            System.out.print("첫 번째 정수를 입력하세요 : ");
            double n1 = sc.nextDouble();
            sc.nextLine();

            System.out.print("사칙연산 기호를 입력하세요 : ");
            String operator = sc.nextLine();

            System.out.print("두 번째 정수를 입력하세요 : ");
            double n2 = sc.nextDouble();
            sc.nextLine();

            arithmeticCalculator.calculate(n1,operator,n2);
            System.out.println();

            System.out.println("메뉴 선택");
            System.out.println("계속 진행 : continue 입력  " + '\n'+
                    "가장 최근에 저정된 결과 확인 : peek "+'\n'+
                    "가장 처음으로 저장된 결과 확인 및 삭제 : poll 입력  " +'\n'+
                    "모든 결과 삭제 : clear 입력 " + '\n' +
                    "입력한 값보다 큰 결과값 확인 : greater" + '\n' +
                    "내림차순으로 정렬한 결과 확인 : sort" + '\n' +
                    "종료 : exit 입력" );

            String s = sc.nextLine();
            switch (s) {
                case "exit":
                    break label;
                case "peek":
                    System.out.println(arithmeticCalculator.getResult());
                    break;
                case "poll":
                    arithmeticCalculator.removeResult();
                    break;
                case "greater" :
                    System.out.print("값 입력: ");
                    double input = sc.nextDouble();
                    System.out.println(arithmeticCalculator.greaterResult(input));
                    sc.nextLine();
                    break;
                case "sort" :
                    System.out.println(arithmeticCalculator.descendSort());
                    break;
                case "clear":
                    arithmeticCalculator.clearResult();
                    break;
            }
        }
    }
}
