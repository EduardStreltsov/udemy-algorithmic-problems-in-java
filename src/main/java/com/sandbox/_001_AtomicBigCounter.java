package com.sandbox;

import java.math.BigInteger;

public class _001_AtomicBigCounter {
	
	private BigInteger count = BigInteger.ZERO;
	
	public BigInteger getCount() {
		return count;
	}
	
	public void inc() {
		count = count.add(BigInteger.ONE);
	}
	
}
