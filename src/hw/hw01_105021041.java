package hw;
/*
 * Topic: 輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 * Date: 2016/10/10
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;

public class hw01_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("輸入正整數(不含0)");
		int n = scn.nextInt();
		int sum = 0;
		while(n>0)
		{sum = sum + 1;
		n = n/10;}
		System.out.println(sum+"位數");

	}

}
