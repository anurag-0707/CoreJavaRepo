package serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Products implements Externalizable {

	String item1;
	String item2;
	String item3;
	String item4;
	String item5;

	public Products() {
		System.out.println("products 0-param Construction");
	}

	public Products(String item1, String item2, String item3, String item4, String item5) {
		super();
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(item1);
		out.writeObject(item3);
		out.writeObject(item5);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		item1 = (String) in.readObject();
		item2 = (String) in.readObject();
		item3 = (String) in.readObject();
		// item4 = (String) in.readObject();
		// item5 = (String) in.readObject();
	}

}
