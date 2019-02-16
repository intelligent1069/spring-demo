package com.spring.demo.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

    @Component
    @Qualifier("Quick")
	public class QuickSort implements SortAlgo{

			public int[] Sort(int[] numbers)
			{
				return numbers;
			}

		}




