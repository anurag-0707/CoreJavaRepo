package serialization;

import java.io.Serializable;

public class Cat1 implements Serializable {
	private static final long serialVersionUID = 1L;
	int i, j, k;
	int m=100;

	public Cat1() {
		super();
	}

	public Cat1(int i, int j, int k) {
		super();
		this.i = i;
		this.j = j;
		this.k = k;
	}

}
