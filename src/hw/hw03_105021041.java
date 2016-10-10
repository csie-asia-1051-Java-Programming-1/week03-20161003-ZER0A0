package hw;
/*
 * Topic:讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/10
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;

public class hw03_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("輸入數字");
		int n = scn.nextInt();
		int sum = 1;
		for(int a = 1;n >= a;a++)
		{sum = sum*a;}
		System.out.println(sum);

	}

}
