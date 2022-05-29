package com.tvs.client;

import com.tvs.application.GSNormalAcc;
import com.tvs.application.GSPrimeAcc;
import com.tvs.application.GSShopFactory;
import com.tvs.framework.NormalAcc;
import com.tvs.framework.PrimeAcc;
import com.tvs.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(101,"Umesh",550, true);
		NormalAcc n=new GSNormalAcc(102, "Rohit", 550,50);
		System.out.println("Prime Account");
		p.bookProduct(p.getCharge());
		System.out.println("Normal Account");
		n.bookProduct(n.getCharges());
		
		//System.out.println(s.getNewPrimeAcc(1, "Hrishi", 1000, true));
		//System.out.println(s.getNewNormalAcc(2, "Kaustubh", 1000,50));
		
		System.out.println(p);
		System.out.println(n);
		
	}

}