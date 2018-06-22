package java8NewFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LembdaExpDemo {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		list.add("ravi");
		list.add("Anurag");
		list.add("prantik");
		list.add("hema");
		list.add("ankit");
		list.add("saurabh");
		
//		list.forEach(n->System.out.println(n));
		
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
		
		
//		list.forEach(System.out::println);
		
		
	}

}
