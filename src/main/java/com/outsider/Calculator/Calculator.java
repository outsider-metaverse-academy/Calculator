package com.outsider.Calculator;

public class Calculator {
    public static void main(String[] args) {
        while(true){
            System.out.print("실행할 연산을 고르세요 1)더하기 2)빼기 3)곱하기 4)나누기 0)종료 : ");
            int selNum = NewScanner.inpuNum(0,4);
            if(selNum == 0){
                break;
            }

            switch (selNum){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.print("첫번째 수를 입력하세요 : ");
                    int first = NewScanner.inpuNum(0);
                    System.out.print("두번째 수를 입력하세요 : ");
                    int second = NewScanner.inpuNum(0);
                    System.out.println("결과값 : "+ Divide.divide(first,second));
                    break;
            }
        }
    }
}
