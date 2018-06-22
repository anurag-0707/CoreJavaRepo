package OOPS;

import java.sql.Array;
import java.util.List;

public class NullTest {

	static String s2;
	int i3;

	public static void main(String[] args) {

		 int i1=0;
		// int i2="Hari";
		String s1 = null;
		System.out.println(s2);
		List l1 = null;
		// System.out.println(l1.size());
		// System.out.println(s1.length());

		System.out.println(s2);
		NullTest t = new NullTest();
		System.out.println(t.i3);
		
		String s3="Anurag Shrivastava";
		System.out.println(s3+"-----Length is :: "+s3.length()+"\n\n");
		String s4=new String("Sriman");
		System.out.println(s4.equals(null));
//		System.out.println(s2.equalsIgnoreCase(null));
		System.out.println(null==null);
		String s5="";
		System.out.println(s5.length());
		

	}

}
