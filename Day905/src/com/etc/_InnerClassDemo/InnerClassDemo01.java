package com.etc._InnerClassDemo;

public class InnerClassDemo01 {
public static void main(String[] args) {
	for (int i = 0; i < 50; i++) {
		System.out.println("����Ϸ"+i);
		if(i==2){
//			new Thread(new Runnable() {       //     1��  �����߳�
//				
//				@Override
//				public void run() {
//					// TODO Auto-generated method stub
//					for (int j = 0; j < 50; j++) {
//						System.out.println("������"+j);
//					}
//				}
//			}).start();
			
			
			
			new Thread(){  
				public void run() {
					for (int j = 0; j < 50; j++) {
						System.out.println("������"+j);
					}
				};
			}.start();
		}
	}
}
}
