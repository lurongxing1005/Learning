package com.etc._HomeWork;

class object1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int i=0;i<7;i++){
			System.out.println("B对象执行了"+i+"秒");
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
class object2 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for(int i=0;i<9;i++){
			System.out.println("C对象执行了"+i+"秒");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}
public class JoinHomeWork {
	public static void main(String[] args) {
		object1 B = new object1();
		object2 C = new object2();
		try {
			for(int i=0;i<5;i++){
				System.out.println("A对象执行了"+i+"秒");
				Thread.sleep(500);
				if(i==4){
					B.start();
					B.join();
				
					C.start();
					C.join();
				}
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
