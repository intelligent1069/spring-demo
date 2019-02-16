package com.spring.demo.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("Quick")
	private SortAlgo SortAl;
	


	public int binSearch(int[] numbers, int numberToSearch)
	{
		int [] sortNum = SortAl.Sort(numbers);
		System.out.println(SortAl);
		
		return 3;
	}

}
