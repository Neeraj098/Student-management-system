package com.neeraj.factory;

import com.neeraj.service.StudentService;
import com.neeraj.service.StudentServiceImpl;

public class StudentServiceFactory {
	private static StudentService studentService;
	static {
		studentService = new StudentServiceImpl();
	}

	public static StudentService getStudentService() {
		return studentService;
	}

}