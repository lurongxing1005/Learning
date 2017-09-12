package com.etc._jdbcdemo;

import java.util.Random;

public class jdbcdemo {
	public static void main(String[] args) {
		//1-10Ëæ»úÊý
		
		//random.nextInt(10)//0---9
		//random.nextInt(10)+1;//1---10
		Random random = new Random();
		for(int i=0;i<100;i++){
			int r = random.nextInt(10)+1;
			System.out.println(r);
		}
		
		
	}

}

