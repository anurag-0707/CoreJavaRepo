package java8NewFeatures;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ReduceMethodDemo {

	public static void main(String[] args) {

		OptionalInt reduced = IntStream.rangeClosed(1, 5).reduce((a,b)->a+b);
		System.out.println(reduced.getAsInt());
		
		System.out.println("------------------------");
		
		int reducedWithIdentity = IntStream.rangeClosed(1, 5).reduce(12,(a,b)->a+b);
		System.out.println(reducedWithIdentity);
		
		System.out.println("------------------------");
		
		Integer reduce = Arrays.asList(1,2,3,4).parallelStream().reduce(7, (a,b)->a+b,(a,b)->{
			System.out.println("combiner is called");
			return a+b;
		});
		System.out.println(reduce);
	}

}

