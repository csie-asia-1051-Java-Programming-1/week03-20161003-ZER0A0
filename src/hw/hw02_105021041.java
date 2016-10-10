package hw;
/*
 * Topic:讓使用者輸入多個數，統計正數、負數及零各有多少個。
 * Date: 2016/10/10
 * Author: 105021041 楊建宸
 */

import java.util.Scanner;

public class hw02_105021041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 1;
		System.out.println("輸入數字");
		while(d==1)
		{int n = scn.nextInt();
		if(n>0){a = a+1;
		System.out.println("繼續請輸入1 or 結束請輸入0");
		int e = scn.nextInt();
		if(e==0){d=0;
		System.out.println("正 = "+a+",負 = "+b+",0 = "+c);}}
		else{if(n<0){b = b+1;
		System.out.println("繼續1 or 結束0");
		int e = scn.nextInt();
		if(e==0){d=0;
		System.out.println("正 = "+a+",負 = "+b+",0 = "+c);}}
		else{if(n==0){c = c+1;
		System.out.println("繼續1 or 結束0");
		int e = scn.nextInt();
		if(e==0){d=0;
		System.out.println("正 = "+a+",負 = "+b+",0 = "+c);}}}}}}

}
