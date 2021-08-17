package com.henry.spring.basics.springin5steps;

import com.henry.spring.basics.springin5steps.basic.BinarySearchImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
public class BinarySearchTest {

	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBinarySearch() {
		int result = binarySearch.binarySearch(new int[]{1, 2, 3, 4},3);
		System.out.println(result);

		assertEquals(3, result);
	}

}
