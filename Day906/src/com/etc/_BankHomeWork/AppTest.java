package com.etc._BankHomeWork;

public class AppTest {
	public static void main(String[] args) {
	
		BankDemo bank = new BankDemo();
		
	
		saveMoney sm = new saveMoney(bank);
		new Thread(sm).start();
		
		
		takeMoney tm = new takeMoney(bank);
		new Thread(tm).start();
		
	}

}
