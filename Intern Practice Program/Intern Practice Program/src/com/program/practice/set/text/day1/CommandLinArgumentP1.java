package com.program.practice.set.text.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommandLinArgumentP1 {
	public static void main(String[] value) {
		System.out.println(value.hashCode());

		CommandLinArgumentP1 cp1 = new CommandLinArgumentP1();

		System.out.println(cp1.hashCode());

		CommandLinArgumentP1 cp2 = new CommandLinArgumentP1();

		System.out.println(cp2.hashCode());

		// length

		System.out.println(value.length);

		// reference variable
		value = new String[] { "Manish Kumar", "Daynil Pvt", "Ram","Ram" };

		System.out.println(value.length);

		System.out.println(value);

		// print String value using iterator

		// 1-way
		List<String> list = new ArrayList<>();
		for (String str : value) {
			list.add(str);
		}
		System.out.println(list);

		// 2-way
		List<String> list2 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			String str2 = list.get(i);
			list2.add(str2);
		}
		
		System.out.println(list2);
		
		//handle duplicacy
		Set<String> set = new HashSet<>();
		for (String str : value) {
			set.add(str);
		}
		
		System.out.println(set);
	}

}
