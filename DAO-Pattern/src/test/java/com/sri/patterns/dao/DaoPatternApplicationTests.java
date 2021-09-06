package com.sri.patterns.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DaoPatternApplicationTests {

	@Autowired
	StudentDao dao;

	@Test
	void testCreate() {

		Student student0 = new Student(0, "Zero", 90);
		Student student1 = new Student(1, "One", 80);
		Student student2 = new Student(2, "Two", 100);

		dao.create(student0);
		dao.create(student1);
		dao.create(student2);
	}

	@Test
	void testDelete() {
		Student student = new Student(0, "Zero", 90);

		dao.delete(student);
	}

}
