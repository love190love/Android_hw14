package com.example.hw14;

public class MyClass {
    public static void main(String[] argv) {
        System.out.println("請輸入三個數值");
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        int c =scanner.nextInt();
        if( a+b>c && a+c>b && b+c>a)
        {
            System.out.println("可以組成三角形");
        }
        else
        {
            System.out.println( "不可以組成三角形") ;
        }
    }
}