package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
	String username = "Anurag";
	String pwd = "shrivastava";
	int pin=9412;
	
	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject();
		String epwd="hqwersd"+pwd;
		int epin=pin+1234;
		os.writeObject(epwd);
		os.writeInt(epin);
	}
	
	private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
		is.defaultReadObject();
		String epwd=(String) is.readObject();
		pwd=epwd.substring(7);
		int epin=is.readInt();
		pin=epin-1234;
	}
	
	
	
}
