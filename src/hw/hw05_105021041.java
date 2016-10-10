package hw;
/*
 * Topic:讓使用者輸入一正整數n，
 * 計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。
 * Date: 2016/10/10
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;

public class hw05_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("輸入數字");
		int n = scn.nextInt();
		int sum = 0;
		int a = 1;
		while(n >= a)
		{sum = sum + a*(a+1);
		a++;}
		System.out.println(sum);

	}

}
