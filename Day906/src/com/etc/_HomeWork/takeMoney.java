package com.etc._HomeWork;

public class takeMoney implements Runnable {
	private BankDemo bank = null;

	public takeMoney(BankDemo band) {
		this.bank = bank;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<50;i++){
			bank.take();
		}
	}
}
