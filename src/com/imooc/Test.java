package com.imooc;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎使用租车系统！");
		System.out.println("您是否需要租车？（1代表是，0代表否）");
		Scanner input=new Scanner(System.in);
		String a=input.next();
		if(a.equals("1")){
			System.out.println("可租车的相关信息：");
		}
		
	} 

}
