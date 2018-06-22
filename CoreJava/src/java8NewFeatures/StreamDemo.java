package java8NewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("ravi");
		list.add("Anurag");
		list.add("prantik");
		list.add("hema");
		list.add("ankit");
		list.add("saurabh");

		Stream<String> stream = list.stream();
		Iterator itr = stream.iterator();

		while (itr.hasNext())
			System.out.println(itr.next());

		System.out.println("----");

		String arr[] = new String[] { "a", "b", "c", "d" };
		Stream<String> strm = Arrays.stream(arr);
		strm.forEach(s -> System.out.println(s));
		System.out.println("----");

		Stream<String> st = Stream.of("AA", "BB", "CC");
		st.forEach(System.out::println);
		System.out.println("----");
	}

}
