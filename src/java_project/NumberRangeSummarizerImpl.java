package java_project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class NumberRangeSummarizerImpl implements NumberRangeSummarizer {

    @Override
    // this method converts a comma-separated String of
    // integers into a Collection of Integer objects.
    public Collection<Integer> collect(String input) {
    	//Creating an empty arraylist called numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        //spliting the inout using the commas and storing the result to parts "new array"
        String[] parts = input.split(",");
        
        for (String part : parts) {
        	//System.out.println(part);
        	// removing spaces and converting the results into integer
        	//and storing it to number
            int number = Integer.parseInt(part.trim());
            //adding the number into the numbers array
            numbers.add(number);
        }
        // finally returning the collection/arraylist
        return numbers;
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
    	// declaring a string builder
        StringBuilder sb = new StringBuilder();
        // declaring an array with the collection
        ArrayList<Integer> sortedNumbers = new ArrayList<>(input);
        // sorting the array in an increasing order
        Collections.sort(sortedNumbers);
        // getting the first value of the array in the first index 0
        int start = sortedNumbers.get(0);
        // setting the initial value of previous
        int prev = start;
        
        
        
        // iterating through the collection of numbers
        for (int i = 1; i < sortedNumbers.size(); i++) {
        	// getting the current value
            int current = sortedNumbers.get(i);
            // checking if the values are sequential
            if (current != prev + 1) {
            	// since then sequence is broken we append based on how many characters are there
                if (start == prev) {
                	// if theres is one one character
                    sb.append(start).append(", ");
                } else {
                	// if there are multiple characters
                    sb.append(start).append("-").append(prev).append(", ");
                }
                //setting the start to current for the next iteration
                start = current;
            }
          //setting the prev to current for the next iteration
            prev = current;
        }
        
        
        // in case there is a missing sequence
        if (start == prev) {
            sb.append(start);
        } else {
            sb.append(start).append("-").append(prev);
        }
        //finally return the string builder object
        return sb.toString();
    }

	
}
