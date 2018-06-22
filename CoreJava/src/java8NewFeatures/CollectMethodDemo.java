package java8NewFeatures;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectMethodDemo {

	public static void main(String[] args) {

		List<Product> products = Arrays.asList(new Product("mango", 50), new Product("Apple", 35),
				new Product("Banana", 40));

		/*List<String> collect = products.stream().map(Product::getName).collect(Collectors.toList());
		collect.forEach(System.out::println);

		System.out.println("-------------------");
		String collect1 = products.stream().map(Product::getName)
				.collect(Collectors.joining("--", "!! ", " !!"));
		System.out.println(collect1);
		System.out.println("-------------------");
		
		Double collect2 = products.stream().collect(Collectors.averagingDouble(Product::getPrice));
		System.out.println(collect2);
		System.out.println("-------------------");
		DoubleSummaryStatistics sum = products.stream().collect(Collectors.summarizingDouble(Product::getPrice));
		System.out.println(sum);
		
		System.out.println("-------------------");
		Map<Integer, List<Product>> collect3 = products.stream().collect(Collectors.groupingBy(Product::getPrice));
		collect3.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		System.out.println("-------------------");
		*/
		Map<Boolean, List<Product>> collect4 = products.stream().collect(Collectors.partitioningBy(p->p.getPrice()>46));
		collect4.forEach((k,v)->{
			System.out.println(k);
			System.out.println(v);
		});
		
		System.out.println("-------------------");
		Set<Product> collect5 = products.stream().collect(Collectors.collectingAndThen(Collectors.toSet(),Collections::unmodifiableSet));
		collect5.forEach(System.out::println);
		System.out.println("-------------------");
		
		
	}

}
