package com.etc._RunableDemo;

class boidWater implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
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

class washCup implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("��ʼϴ��" + (i + 1) + "������");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class RunableDemo01 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new boidWater());
		Thread t2 = new Thread(new washCup());
		t1.start();
		t2.start();
	}
}
