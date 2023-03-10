package com.controlFlowSamples;

public class ForEachSample {

	public static void main(String[] args) {
		int[]numbers= {3,4,5,-5,0,12};
		int sum=0;
		
		for(int number:numbers) {
			sum+=number;
		}
		System.out.println("Sum=" +sum);
	}

}
// for each loop is used to traverse array or collection in java.
// it works on the basis of elements and not the index. it returns element one by one in defined variable.