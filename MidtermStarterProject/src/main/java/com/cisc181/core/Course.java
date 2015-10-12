/**
 * 
 */
package com.cisc181.core;

import java.util.UUID;

/**
 * @author GE60
 *
 */
public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;

	/**
	 * @return the courseID
	 */
	public UUID getCourseID() {
		return CourseID;
	}

	/**
	 * @param courseID the courseID to set
	 */
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return CourseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	/**
	 * @return the gradePoints
	 */
	public int getGradePoints() {
		return GradePoints;
	}

	/**
	 * @param gradePoints the gradePoints to set
	 */
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}

	/**
	 * 
	 */
	public Course() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
