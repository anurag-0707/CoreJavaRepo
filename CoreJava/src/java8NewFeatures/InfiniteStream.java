package java8NewFeatures;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class InfiniteStream {

	public static void main(String[] args) {

		/*
		 * Supplier<UUID> uuid = UUID::randomUUID; Stream<UUID> generate =
		 * Stream.generate(uuid); List<UUID> list =
		 * generate.limit(10).skip(15).collect(Collectors.toList()); list.forEach(l ->
		 * System.out.println(l));
		 * 
		 * System.out.println("------------------------");
		 * 
		 * Stream<Integer> iterate=Stream.iterate(0, i->i+1);
		 * iterate.skip(30).limit(20).forEach(System.out::println);
		 * 
		 * System.out.println("------------------------"); Stream<String>
		 * strm=Stream.<String>builder().add("vishal").add("karam").build();
		 * strm.forEach(System.out::println);
		 * 
		 * System.out.println("------------------------");
		 * Stream.generate(()->"hello").limit(2).forEach(s->System.out.println(s));
		 * System.out.println("------------------------");
		 * 
		 * IntStream is = IntStream.range(0, 5); IntStream isc =
		 * IntStream.rangeClosed(0, 5); is.forEach(System.out::println);

		System.out.println("------------------------");

		LongStream ls = LongStream.range(0, 5);
		LongStream lsc = LongStream.rangeClosed(0, 5);
		lsc.forEach(System.out::println);
		 */
		
		System.out.println("------------------------");

		Random rad=new Random();
		DoubleStream ds=rad.doubles(2);
		ds.forEach(System.out::println);


	}

}
