package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomSirialization {

	public static void main(String[] args) throws Exception {
		Account acc=new Account();
		System.out.println(acc.username+"----"+acc.pwd+"----"+acc.pin);

		FileOutputStream fos=new FileOutputStream("acount.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(acc);
		
		FileInputStream fis=new FileInputStream("acount.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account acc1=(Account) ois.readObject();
		System.out.println(acc1.username+"----"+acc1.pwd+"----"+acc1.pin);


	}

}
