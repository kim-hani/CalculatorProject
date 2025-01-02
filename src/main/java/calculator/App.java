package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total =0;

        while(true){
            System.out.print("첫 번째 정수를 입력하세요 : ");
            int n1 = sc.nextInt();
            sc.nextLine();

            System.out.print("사칙연산 기호를 입력하세요 : ");
            String operator = sc.nextLine();

            System.out.print("두 번째 정수를 입력하세요 : ");
            int n2 = sc.nextInt();
            sc.nextLine();


            switch (operator){
                case("+"):
                    total = n1 + n2;
                    System.out.println("더하기 결과 값은 " + total +"입니다.");
                    break;
                case("-"):
                    total = n1 - n2;
                    System.out.println("빼기 결과 값은 " + total +"입니다.");
                    break;

                case("*"):
                    total = n1 * n2;
                    System.out.println("곱하기 결과 값은 " + total +"입니다.");
                    break;

                case("/"):
                    if(n2==0){
                        System.out.println("0으로는 나눌 수 없습니다.");
                        return;
                    }
                    total = (double) n1 / n2;
                    System.out.println("나누기 결과 값은 " + total +"입니다.");
                    break;
                default:
                    System.out.println("정확한 연산기호를 입력하세요");
                    break;
            }
            System.out.println("계속 하시겠습니까? (exit 입력 시 종료)");
            if(sc.nextLine().equals("exit")) break;
        }
    }
}
