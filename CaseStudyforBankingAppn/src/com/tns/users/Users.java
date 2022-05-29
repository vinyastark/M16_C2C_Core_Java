package com.tns.users;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Users {

	public static void main(String[] args) {
		BankFactory s=new MMBankFactory();
		SavingAcc p=new MMSavingAcc(90001203,"Vinay Joshi", 8500.47F, true);
		CurrentAcc n=new MMCurrentAcc(90001204, "Ajay Patil", 54550.25F,50);
		System.out.println("Saving Account");
		p.withdraw(p.getaccBal());
		System.out.println("Current Account");
		n.withdraw(n.getMINBAL());
		
		
		System.out.println(p);
		System.out.println(n);

	}

}