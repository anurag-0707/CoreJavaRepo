package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationDemo {

	public static void main(String[] args) throws Exception {
		
		Products p=new Products("AC","Fridge","Car","Microwave","Cooler");
		FileOutputStream fos=new FileOutputStream("products.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);

		FileInputStream fis=new FileInputStream("products.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Products p1=(Products) ois.readObject();
		System.out.println(p1.item1+"-----"+p1.item2+"-----"+p1.item3+"-----"+p1.item4+"-----"+p1.item5);
		
	}

}
