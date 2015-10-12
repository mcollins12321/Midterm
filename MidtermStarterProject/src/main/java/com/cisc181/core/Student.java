package com.cisc181.core;

import java.util.Date;
import com.cisc181.eNums.*;

public class Student extends Person {

	private String eMajor;
	
	public String getMajor ( )
    {
        return this.eMajor;
    }
    public void setMajor (String Major)
    {
        this.eMajor = Major;           
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, String Major,
			String Address, String Phone_number, String Email, String Major1) 
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.eMajor = Major1;
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
}