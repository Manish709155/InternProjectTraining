package com.program.practice.set.text.day1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CheckTheGivenNumberIsOddOrEvenP4 {

	public static void main(String[] args) {

//		using core java

		int[] nums = new int[] { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int n = nums.length;

		for (int i = 0; i < n; i++) {

			int value = nums[i];

			if (value % 2 == 0) {
				System.out.println("The Given Number is Even:" + value);
			} else {
				System.out.println("The Given Number is Odd:" + value);
			}

		}

		// 2 -way

//		int num =11;
//		if(num%2==0) {
//			System.out.println("The Given Number is Even:" +num);
//		}
//		else {
//			System.out.println("The Given Number is Odd:" +num);
//		}

		// 3-way

		List<Integer> list = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		List<Integer> evenNumber = list.stream().filter(data -> data % 2 == 0).collect(Collectors.toList());
		List<Integer> oddNumber = list.stream().filter(data -> data % 2 != 0).collect(Collectors.toList());
		System.out.println("The Given Number is Even:" + evenNumber);
		System.out.println("The Given Number is Even:" + oddNumber);

		// Using SCanner class way -4

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n1 = sc.nextInt();
		int[] arr = new int[n1];
		System.out.println("Enter the values of the array :");
		for (int i = 0; i < n1; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] % 2 == 0) {
				System.out.println("The Given Number is Even:" + arr[i]);
			} else {
				System.out.println("The Given Number is Odd:" + arr[i]);
			}

		}

	}

}
