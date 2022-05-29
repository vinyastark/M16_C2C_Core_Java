package com.tns.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;

	public BankAcc(int accNo, String accNm, float accBal)
	{
	this.accNo= accNo;
	this.accNm = accNm;
	this.accBal =accBal;
	
	}

	abstract public void withdraw (float accBal);
	public void items(float accBal)
	{
		System.out.println(accBal);
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public float getaccBal() {
		return accBal;
	}
	public float getMINBAL() {
		return accBal;
	}

	@Override
	public String toString() {
		return String.format("ShopAcc [accNo=%s, accNm=%s, accBal=%s]", accNo, accNm, accBal);
	}

}