package com.program.practice.set.text.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckNumberIsPostiveOrNegativeP3 {

	public static void main(String[] args) {

		// core java
		int num = -10;
		if (num < 0) {
			// System.out.println("The Given Is Negative: " + num);
		} else {
			// System.out.println("The Given Is Postive: " + num);
		}

		// using java8

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(-40);
		list.add(-50);
		list.add(-60);
		List<Integer> postiveNum = new ArrayList<>();
		List<Integer> negativeNum = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			Integer value = list.get(i);

			if (value < 0) {
				negativeNum.add(value);

			} else if (value > 0) {
				postiveNum.add(value);

			}

		}
		System.out.println("Negative Number: " + negativeNum);
		System.out.println("Postive Number: " + postiveNum);

		// optimized code// optimized code
//		List<Integer> list2 = Arrays.asList(10, 20, 30, -40, -50, -60);
		List<Integer> list2 = List.of(10, 20, 30, -40, -50, -60);
		List<Integer> postNum = list2.stream().filter(num1 -> num1 > 0).collect(Collectors.toList());
		List<Integer> negtNum = list2.stream().filter(num1 -> num1 < 0).collect(Collectors.toList());
		
		System.out.println("Negative Number: " + negtNum);
		System.out.println("Postive Number: " + postNum);


	}

}
