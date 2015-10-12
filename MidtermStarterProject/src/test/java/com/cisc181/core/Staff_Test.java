package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.core.Staff;
import com.cisc181.eNums.*;

public class Staff_Test {
	private static Staff staff1;
	private static Staff staff2;
	private static Staff staff3;
	private static Staff staff4;
	private static Staff staff5;
	private static Staff staff6;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		staff1 = new Staff(null, null, null, null, null, null, null, null, 0, 17, null, null);
		staff2 = new Staff(null, null, null, null, null, null, null, null, 0, 6, null, null);
		staff3 = new Staff(null, null, null, null, null, null, null, null, 0, 95, null, null);
		staff4 = new Staff(null, null, null, null, null, null, null, null, 0, 12.5, null, null);
		staff5 = new Staff(null, null, null, null, null, null, null, null, 0, 77.7, null, null);
		ArrayList<Staff> SalariesTest = new ArrayList<Staff>();
		SalariesTest.add(staff1);
		SalariesTest.add(staff2);
		SalariesTest.add(staff3);
		SalariesTest.add(staff4);
		SalariesTest.add(staff5);
		staff6 = new Staff(null, null, null, Oct 32, 2015, 1:35:14 PM, null, 781796087, null, null, 0, 0, null, null);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue((staff1.getSalary() + staff2.getSalary() +staff3.getSalary() +staff4.getSalary() +staff5.getSalary())/5 == 41.64);
		//System.out.print((staff1.getSalary() + staff2.getSalary() +staff3.getSalary() +staff4.getSalary() +staff5.getSalary())/5);
		assertTrue(staff6.getDOB()=="null");
		assertTrue(staff6.getPhone()=="null");
	}

}
