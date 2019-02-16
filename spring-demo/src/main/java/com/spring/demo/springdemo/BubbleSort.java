package com.spring.demo.springdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Bubble")
public class BubbleSort implements SortAlgo{

		public int[] Sort(int[] numbers)
		{
			return numbers;
		}

	}


