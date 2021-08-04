/**
 * 
 */
package javaEightInAction.behaviourParameterization;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javaEightInAction.Apple;

/**
 * <b>Sorting with a Comparator</b>
 * <p>
 * In java 8, a List comes with a sort method.
 * 
 * @author prosanna
 *
 */
public class SortingWithComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello");

		// @formatter:off
		List<Apple> appleList = Arrays.asList(new Apple("green", 90), 
												new Apple("red", 1000), 
												new Apple("green", 900),
												new Apple("green", 600));
		// @formatter:on

		/*
		 * appleList.sort(new Comparator<Apple>() { public int compare(Apple a1, Apple
		 * a2) { return Integer.compare(a1.getWeight(),a2.getWeight()); } });
		 */
		
		appleList.sort((Apple a1,Apple a2)-> Integer.compare(a1.getWeight(), a2.getWeight()));
		
		for (Apple apple : appleList) {
			System.out.println("Sorted Apple List : " + apple.getColor() + " " + apple.getWeight());
		}

	}

}
