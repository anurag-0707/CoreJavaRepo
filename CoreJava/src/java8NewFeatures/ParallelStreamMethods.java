package java8NewFeatures;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamMethods {

	public static void main(String[] args) {

		List<Product> products = Arrays.asList(new Product("mango", 50), new Product("Apple", 35),
				new Product("Banana", 40));

		Stream<Product> parallelStream = products.parallelStream();
		System.out.println(parallelStream.isParallel());
		boolean anyMatch = parallelStream.map(p->p.getPrice()*5).anyMatch(r->r>180);		
		System.out.println(anyMatch);
		System.out.println("-------------------");
		
		IntStream parallel = IntStream.range(1, 150).parallel();
		System.out.println(parallel.isParallel());
//		parallel.forEach(System.out::println);
		
		System.out.println("-------------------");
		IntStream sequential = parallel.sequential();
		System.out.println(sequential.isParallel());
		sequential.forEach(System.out::println);
		

		System.out.println("-------------------");
		
		

		System.out.println("-------------------");
		
		
	}

}
