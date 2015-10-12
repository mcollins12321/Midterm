/**
 * 
 */
package com.cisc181.core;

import static org.junit.Assert.*;


import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.core.Student;
import com.cisc181.eNums.eMajor;

/**
 * @author GE60
 *
 */
public class Student_Test {
	private static Course course1;
	private static Course course2;
	private static Course course3;
	private static Semester Fall;
	private static Semester Spring;
	private static Section Fall1;
	private static Section Fall2;
	private static Section Fall3;
	private static Section Spring1;
	private static Section Spring2;
	private static Section Spring3;
	private static Student student1;
	private static Student student2;
	private static Student student3;
	private static Student student4;
	private static Student student5;
	private static Student student6;
	private static Student student7;
	private static Student student8;
	private static Student student9;
	private static Student student10;
	private static Student student11;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		course1 = new Course();
		course2 = new Course();
		course3 = new Course();
		Fall = new Semester();
		Spring = new Semester();
		Fall1 = new Section();
		Fall2 = new Section();
		Fall3 = new Section();
		Spring1 = new Section();
		Spring2 = new Section();
		Spring3 = new Section();
		student1 = new Student(null, null, null, null, null, null, null, null, null);
		student2 = new Student(null, null, null, null, null, null, null, null, null);
		student3 = new Student(null, null, null, null, null, null, null, null, null);
		student4 = new Student(null, null, null, null, null, null, null, null, null);
		student5 = new Student(null, null, null, null, null, null, null, null, null);
		student6 = new Student(null, null, null, null, null, null, null, null, null);
		student7 = new Student(null, null, null, null, null, null, null, null, null);
		student8 = new Student(null, null, null, null, null, null, null, null, null);
		student9 = new Student(null, null, null, null, null, null, null, null, null);
		student10 = new Student(null, null, null, null, null, null, null, null, null);
		student11 = new Student(null, null, null, null, null, null, null, null, CISC);
		
		ArrayList<Course> Courses = new ArrayList<Course>();
		Courses.add(course1);
		Courses.add(course2);
		Courses.add(course3);
		
		ArrayList<Semester> Semesters = new ArrayList<Semester>();
		Semesters.add(Fall);
		Semesters.add(Spring);
		
		ArrayList<Section> Sections = new ArrayList<Section>();
		Sections.add(Fall1);
		Sections.add(Fall2);
		Sections.add(Fall3);
		Sections.add(Spring1);
		Sections.add(Spring2);
		Sections.add(Spring3);
		
		ArrayList<Student> Students = new ArrayList<Student>();
		Students.add(student1);
		Students.add(student2);
		Students.add(student3);
		Students.add(student4);
		Students.add(student5);
		Students.add(student6);
		Students.add(student7);
		Students.add(student8);
		Students.add(student9);
		Students.add(student10);
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		student11.setMajor(PHYSICS);
		assertTrue(student11.getMajor()==PHYSICS);
		//System.out.print(student11.getMajor());
	}

}
