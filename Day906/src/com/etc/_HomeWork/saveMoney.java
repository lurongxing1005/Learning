package com.etc._HomeWork;

import java.text.SimpleDateFormat;
import java.util.Date;

public class saveMoney implements Runnable {
	private BankDemo bank = null;

	public saveMoney(BankDemo band) {
		this.bank = bank;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 50; i++) {
			SimpleDateFormat sdFormat = new SimpleDateFormat(
					"yyyy��MM��dd��HH��mm��ss");
			String string = sdFormat.format(new Date());
			if (i % 2 == 0) {
				bank.save(1000, string);
			} else {
				bank.save(2000, string);
			}
		}

	}
}