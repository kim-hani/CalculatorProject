package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while(true) {
            System.out.print("첫 번째 정수를 입력하세요 : ");
            int n1 = sc.nextInt();
            sc.nextLine();

            System.out.print("사칙연산 기호를 입력하세요 : ");
            String operator = sc.nextLine();

            System.out.print("두 번째 정수를 입력하세요 : ");
            int n2 = sc.nextInt();
            sc.nextLine();

            calculator.calculate(n1,operator,n2);

            System.out.println("계속 하시겠습니까? (exit 입력 시 종료)");
            if(sc.nextLine().equals("exit")) break;
        }
    }
}
