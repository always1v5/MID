package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	
	private Staff one;
	private Staff tow;
	private Staff third;
	private Staff four;
	private Staff five;
	private  ArrayList<Staff> NEWLIST;
	
	
	

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}	
	
	
	
	public void salariesTest(){
		NEWLIST = new ArrayList<Staff>();
		NEWLIST.add(one);
		NEWLIST.add(tow);
		NEWLIST.add(third);
		NEWLIST.add(four);
		NEWLIST.add(five);
		
		
			
		
		
	}
}