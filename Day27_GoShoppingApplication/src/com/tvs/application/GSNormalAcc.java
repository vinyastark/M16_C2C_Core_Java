package com.tvs.application;

import com.tvs.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc 
{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		super(accNo, accNm, charges, deliveryCharges);
		
	}

	@Override
	public String toString() {
		return String.format("GSNormalAcc [toString()=%s]", super.toString());
	}
	

}