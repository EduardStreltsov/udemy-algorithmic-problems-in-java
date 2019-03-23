package com.real_interviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class _002_FreedomRocksTest {
	
	private static final String FREEDOM = "Freedom";
	private static final String ROCKS = "Rocks";
	private static final String FREEDOM_ROCKS = "FreedomRocks";
	
	@Test
	private void getFreedomRocksStringTest() {
		
		// positive flow
		assertEquals(FREEDOM, _002_FreedomRocks.getFreedomRocksString(3));
		assertEquals(FREEDOM, _002_FreedomRocks.getFreedomRocksString(9));
		assertEquals(FREEDOM, _002_FreedomRocks.getFreedomRocksString(33));
		assertEquals(FREEDOM, _002_FreedomRocks.getFreedomRocksString(99));
		
		assertEquals(ROCKS, _002_FreedomRocks.getFreedomRocksString(5));
		assertEquals(ROCKS, _002_FreedomRocks.getFreedomRocksString(10));
		assertEquals(ROCKS, _002_FreedomRocks.getFreedomRocksString(20));
		assertEquals(ROCKS, _002_FreedomRocks.getFreedomRocksString(100));
		
		assertEquals(FREEDOM_ROCKS, _002_FreedomRocks.getFreedomRocksString(15));
		assertEquals(FREEDOM_ROCKS, _002_FreedomRocks.getFreedomRocksString(30));
		assertEquals(FREEDOM_ROCKS, _002_FreedomRocks.getFreedomRocksString(45));
		assertEquals(FREEDOM_ROCKS, _002_FreedomRocks.getFreedomRocksString(90));
		
		assertEquals("-1", _002_FreedomRocks.getFreedomRocksString(-1));
		assertEquals("0", _002_FreedomRocks.getFreedomRocksString(0));
		assertEquals("1", _002_FreedomRocks.getFreedomRocksString(1));
		assertEquals("2", _002_FreedomRocks.getFreedomRocksString(2));
		assertEquals("17", _002_FreedomRocks.getFreedomRocksString(17));
		
		// negative flow
		assertNotEquals("3", _002_FreedomRocks.getFreedomRocksString(3));
		assertNotEquals(ROCKS, _002_FreedomRocks.getFreedomRocksString(3));
		assertNotEquals(FREEDOM_ROCKS, _002_FreedomRocks.getFreedomRocksString(3));
		
		assertNotEquals("5", _002_FreedomRocks.getFreedomRocksString(5));
		assertNotEquals(FREEDOM, _002_FreedomRocks.getFreedomRocksString(5));
		assertNotEquals(FREEDOM_ROCKS, _002_FreedomRocks.getFreedomRocksString(5));
		
		assertNotEquals("15", _002_FreedomRocks.getFreedomRocksString(15));
		assertNotEquals(FREEDOM, _002_FreedomRocks.getFreedomRocksString(15));
		assertNotEquals(ROCKS, _002_FreedomRocks.getFreedomRocksString(15));
		
		assertNotEquals(FREEDOM, _002_FreedomRocks.getFreedomRocksString(7));
		assertNotEquals(ROCKS, _002_FreedomRocks.getFreedomRocksString(7));
		assertNotEquals(FREEDOM_ROCKS, _002_FreedomRocks.getFreedomRocksString(7));
	}
	
}