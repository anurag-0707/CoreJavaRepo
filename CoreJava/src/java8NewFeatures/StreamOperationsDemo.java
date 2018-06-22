package java8NewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamOperationsDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("ravi");
		list.add("Anurag");
		list.add("prantik");
		list.add("hema");
		list.add("ankit");
		list.add("saurabh");

		long count=list.stream().distinct().count();
		System.out.println(count);
		System.out.println("----");
		
		boolean match=list.stream().anyMatch(new Predicate<String>() {

			@Override
			public boolean test(String st) {
				if(st.contains("3an"))
					return true;
				else
				return false;
			}
		});
		System.out.println(match);
		
		/*Iterator itr = stream.iterator();

		while (itr.hasNext())
			System.out.println(itr.next());*/

		System.out.println("----");

		String arr[] = new String[] { "a", "b", "c", "d" };
		Stream<String> strm = Arrays.stream(arr);
		System.out.println(strm.count());
		System.out.println("----");

		Stream<String> st = Stream.of("AA", "BB", "CC");
		boolean isMatch=st.anyMatch(mt->mt.contains("D"));
		System.out.println(isMatch);
		
	}

}
