package com.etc._ThreadDemo;

class boidWater extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		System.out.println("��ʼ��ˮ��");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("��ˮ������");
	}
}
class washCup extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int i= 0;i<5;i++){
			System.out.println("��ʼϴ��"+(i+1)+"������");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo01 {
public static void main(String[] args) {
	boidWater bw = new boidWater();
	washCup wc = new washCup();
	bw.start();
	wc.start();
	
}
}
