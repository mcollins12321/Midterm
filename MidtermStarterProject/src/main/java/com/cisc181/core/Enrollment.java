/**
 * 
 */
package com.cisc181.core;

import java.util.UUID;

/**
 * @author GE60
 *
 */
public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

	/**
	 * @param grade the grade to set
	 */
	public void SetGrade(double grade) {
		Grade = grade;
	}
	/**
	 * 
	 */
	private Enrollment() {
		// TODO Auto-generated constructor stub
	}
	public Enrollment(UUID StudentID, UUID SectionID) {
		EnrollmentID = getEnrollmentID();
		}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * @return the sectionID
	 */
	public UUID getSectionID() {
		return SectionID;
	}
	/**
	 * @param sectionID the sectionID to set
	 */
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	/**
	 * @return the studentID
	 */
	public UUID getStudentID() {
		return StudentID;
	}
	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}
	/**
	 * @return the enrollmentID
	 */
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	/**
	 * @param enrollmentID the enrollmentID to set
	 */
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	/**
	 * @return the grade
	 */
	public double getGrade() {
		return Grade;
	}
	

}
