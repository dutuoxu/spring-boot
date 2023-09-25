package org.springframework.boot.main;

import org.springframework.util.ClassUtils;

public class ApiTest {

	public static void main(String[] args) {
		boolean present = ClassUtils.isPresent
				("java.lang.String", null);

		System.out.println(present);
	}
}
