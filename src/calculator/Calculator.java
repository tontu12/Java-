package calculator;

import java.util.Scanner;

/**
 * シンプルな電卓アプリケーション
 * 基本的な四則演算を実行できます
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== シンプル電卓 ===");
        System.out.println("演算を選択してください:");
        System.out.println("1. 足し算 (+)");
        System.out.println("2. 引き算 (-)");
        System.out.println("3. 掛け算 (*)");
        System.out.println("4. 割り算 (/)");
        System.out.print("選択 (1-4): ");
        
        int choice = scanner.nextInt();
        
        System.out.print("最初の数値を入力: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("2番目の数値を入力: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.println("結果: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.println("結果: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.println("結果: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = divide(num1, num2);
                    System.out.println("結果: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("エラー: 0で割ることはできません");
                }
                break;
            default:
                System.out.println("無効な選択です");
        }
        
        scanner.close();
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static double divide(double a, double b) {
        return a / b;
    }
}
