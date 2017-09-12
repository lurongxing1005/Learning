package com.etc._ThreadDemo;

class boidWater extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		System.out.println("开始烧水了");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("烧水结束了");
	}
}
class washCup extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int i= 0;i<5;i++){
			System.out.println("开始洗第"+(i+1)+"个杯子");
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
