package java_project;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;



public class Main {

	public static void main(String[] args) {
	
		String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
		//instatiating an instance of NymberRangeSummariserImplementation
		NumberRangeSummarizerImpl myval = new NumberRangeSummarizerImpl();
		// Displaying the results
		System.out.println(myval.summarizeCollection(myval.collect(input)));
		
	}
	
	
}
