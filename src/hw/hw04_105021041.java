package hw;
/*
 * Topic:讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/10
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;

public class hw04_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("輸入數字");
		int n = scn.nextInt();
		int sum = 1;
		int a = 1;
		while(a<=n)
		{sum = sum*a;
		a = a + 1;}
		System.out.println(sum);

	}

}
