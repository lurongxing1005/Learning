package com.etc._BankHomeWork;

import java.text.SimpleDateFormat;
import java.util.Date;


public class saveMoney implements Runnable {
	private BankDemo bank = null;
	
	public saveMoney(BankDemo bank){
		this.bank = bank;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<50;i++){
			SimpleDateFormat sdFormat = new SimpleDateFormat(
					"yyyy��MM��dd��HH��mm��ss");
			String string = sdFormat.format(new Date());
			
				bank.save(1000, string);
			
			
		}
		
	}

}
