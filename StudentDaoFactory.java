package com.neeraj.factory;

import com.neeraj.dao.StudentDao;
import com.neeraj.dao.StudentDaoImpl;

public class StudentDaoFactory {
	private static StudentDao studentDao;
	static {
		studentDao = new StudentDaoImpl();
	}

	public static StudentDao getStudentDao() {
		return studentDao;
	}
}
