package calculator2;

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

            System.out.println("메뉴 선택");
            System.out.println("계속 진행 : continue 입력  / " +
                    "가장 처음으로 저장된 결과 확인 및 삭제 : poll 입력 / " +
                    "모든 결과 삭제 : clear 입력 / " +
                    "종료 : exit 입력" );
            if(sc.nextLine().equals("exit")) break;
            else if(sc.nextLine().equals("poll")) calculator.getQueue();
            else if (sc.nextLine().equals("clear")) calculator.clearQueue();
        }
    }
}
