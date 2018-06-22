package serialization;

import java.io.Serializable;

public class Dog extends Animal  implements Serializable  {

	public Dog() {
		super("Ram");
		System.out.println("Dog Constructor Called");
	}

	int k = 30;
}
