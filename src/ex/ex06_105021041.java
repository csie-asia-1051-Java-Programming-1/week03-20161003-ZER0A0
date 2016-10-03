package ex;
/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;

public class ex06_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int X = scn.nextInt();
		double Y1 = 3*(Math.pow(X,2));
		double Y2 = (Math.pow(X,3) + 3*X-3);
		double Y3 = 2*X+3;
		if(X < -1){System.out.println(Y1);}
		else{if(-1 <= X && X <= 1){System.out.println(Y2);}
		else{if(X > 1){System.out.println(Y3);}}}


	}

}
