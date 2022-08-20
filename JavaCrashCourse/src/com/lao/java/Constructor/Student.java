package com.lao.java.Constructor;

public class Student
{
	String studentName;
	long studentId;
	
	/* Note :-
	 When We dont provide any Constructor,compiler will provide one.
	 We Can't see it but it will be in class file.
	 It is used to provide default values to object like 0,null 
	 depending on the data type
	*/
	Student() //No Arguments Constructor.. This is not Default constructor
	{
		studentName="srini";
		studentId=218027101l;
	}
	
	Student(String name,Long Id) //Parameterized Constructor
	{
		studentName=name;
		studentId=Id;
	}
	void sayAboutStudent() //User Defined Methods
	{
		System.out.println("Student Name is "+studentName+" And RollNumber is "+studentId);
	}
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student student=new Student();
		student.sayAboutStudent();
		Student student1=new Student("Iswarya Lakshmi",218027038l);
		student1.sayAboutStudent();
		
	}

}
