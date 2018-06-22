package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomSerialVirsionUIDSender {

	public static void main(String[] args) throws Exception {
		Cat1 c1= new Cat1(11,12,13);
		FileOutputStream fos=new FileOutputStream("CSVUID.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c1);
		

	}

}
