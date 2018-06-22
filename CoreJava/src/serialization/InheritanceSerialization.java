package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class InheritanceSerialization {

	public static void main(String[] args) throws Exception{

		Dog d1=new Dog();
		d1.i=1111;
		d1.j=2222;
		d1.k=3333;
		
		System.out.println("Serialization Started");
		FileOutputStream fos=new FileOutputStream("xyz.txt");
		ObjectOutput oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		System.out.println("De-Serialization Started");
//		Dog d2=new Dog();
		FileInputStream fis=new FileInputStream("xyz.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog) ois.readObject();
		System.out.println(d2.i+"--"+d2.j+"--"+d2.k);
		
	}

}
