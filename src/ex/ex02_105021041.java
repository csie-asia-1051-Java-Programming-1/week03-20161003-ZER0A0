package ex;
/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;

public class ex02_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		char X = scn.next().charAt(0);
		int Y = X - 'a';
		if(Y >= 0 && Y < 26){System.out.println("小寫");}
		else{Y = X - 'A';
		if(Y >= 0 && Y < 26){System.out.println("大寫");}
		else{System.out.println("其他字元");}
		}

	}

}
