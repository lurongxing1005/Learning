package com.etc._ThreadDemo;
class person extends Thread{
	private int num = 50;
	person(String name){
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		for (int i = 0; i < 50; i++) {
			if(num>0){
			System.out.println(super.getName()+"吃了第"+num--+"个苹果");
			}
		}
	}
}
public class Apple02 {
public static void main(String[] args) {
	new person("jdck").start();
	new person("rose").start();
	
}
}
