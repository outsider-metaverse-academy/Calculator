package com.outsider.Calculator;

import java.util.Scanner;

class NewScanner {
    public static int inpuNum() {
        int n=0;
        Scanner scan;
        while (true) {
            try {
                scan = new Scanner(System.in);
                n = scan.nextInt();
                break;
            } catch (Exception e) {
                System.err.println("잘못된 입력방식입니다. 다시 입력해주세요");
            }
        }
        return n;
    }

    public static int inpuNum(int natural) {
        int n=0;
        Scanner scan;
        while (true) {
            try {
                scan = new Scanner(System.in);
                n = scan.nextInt();
                if(n>natural) {
                    break;
                }else
                {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.err.println(natural+"보다 큰 수를 넣어주세요");
            }
        }
        return n;
    }

    public static int inpuNum(int start,int end) {
        int n=0;
        Scanner scan;
        while (true) {
            try {
                scan = new Scanner(System.in);
                n = scan.nextInt();
                if(n>=start&&n<=end) {
                    break;
                }else
                {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.err.println("잘못된 범위입니다. 다시 입력해주세요");
            }
        }
        return n;
    }
}