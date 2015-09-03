package packageTest;

import java.math.BigInteger;
import java.util.*;

public class ClassTest {
	public static void main(String[] args) {
		Ep a = new Ep(10);
		Ep b = new Ep(9);
		//swap(a, b);
		Ep aa = a;
		Ep bb = b;
		Ep c = aa;
		aa = bb;
		bb = c;
		System.out.println(b.x);
	}
	static void swap(Ep a, Ep b) {
		Ep c = a;
		a = b;
		b = c;
		System.out.println(b.x);
	}
}

class Ep {
	Ep(int y) {
		x = y;
	}
	public int x;
}