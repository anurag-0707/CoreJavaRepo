package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomSerialVirsionUIDReceiver {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("CSVUID.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Cat1 c2=(Cat1) ois.readObject();
		System.out.println(c2.i+"----"+c2.j+"----"+c2.k);

	}

}
